class Solution:
    def smallestNumber(self, num: str, t: int) -> str:
        # prime contribution of each digit
        p2 = [0, 0, 1, 0, 2, 0, 1, 0, 3, 0]
        p3 = [0, 0, 0, 1, 0, 0, 1, 0, 0, 2]
        p5 = [0, 0, 0, 0, 0, 1, 0, 0, 0, 0]
        p7 = [0, 0, 0, 0, 0, 0, 0, 1, 0, 0]

        # factorize t
        need2 = need3 = need5 = need7 = 0

        while t % 2 == 0:
            need2 += 1
            t //= 2
        while t % 3 == 0:
            need3 += 1
            t //= 3
        while t % 5 == 0:
            need5 += 1
            t //= 5
        while t % 7 == 0:
            need7 += 1
            t //= 7

        if t != 1:
            return "-1"

        def min_digits(a, b, c, d):
            """Minimum digits needed to provide remaining prime exponents."""
            ans = c + d  # 5s and 7s have their own dedicated digits
            
            # Find the best combination of 8s, 9s, and 6s for the 2s and 3s
            # We never optimally need more than two 6s.
            ans_23 = float('inf')
            for c6 in (0, 1, 2):
                rem2 = max(0, a - c6)
                rem3 = max(0, b - c6)
                # (rem2 + 2) // 3 is math.ceil(rem2 / 3)
                # (rem3 + 1) // 2 is math.ceil(rem3 / 2)
                cur = c6 + (rem2 + 2) // 3 + (rem3 + 1) // 2
                if cur < ans_23:
                    ans_23 = cur
            
            return ans + ans_23

        n = len(num)

        # prefix contributions
        pref2 = [0] * (n + 1)
        pref3 = [0] * (n + 1)
        pref5 = [0] * (n + 1)
        pref7 = [0] * (n + 1)

        for i, ch in enumerate(num):
            d = ord(ch) - ord('0')
            pref2[i + 1] = pref2[i] + (p2[d] if d else 0)
            pref3[i + 1] = pref3[i] + (p3[d] if d else 0)
            pref5[i + 1] = pref5[i] + (p5[d] if d else 0)
            pref7[i + 1] = pref7[i] + (p7[d] if d else 0)

        # check if original number is fully valid
        if ('0' not in num and
                pref2[n] >= need2 and
                pref3[n] >= need3 and
                pref5[n] >= need5 and
                pref7[n] >= need7):
            return num

        def build_same_length():
            # If there's a zero, we can only safely change digits up to the first zero. 
            # Modifying digits strictly after the first zero would still result in a prefix with a zero.
            z = num.find('0')
            start_i = z if z != -1 else n - 1
            
            for i in range(start_i, -1, -1):
                start_d = 1 if num[i] == '0' else int(num[i]) + 1
                
                have2, have3, have5, have7 = pref2[i], pref3[i], pref5[i], pref7[i]

                for nd in range(start_d, 10):
                    cur2 = have2 + p2[nd]
                    cur3 = have3 + p3[nd]
                    cur5 = have5 + p5[nd]
                    cur7 = have7 + p7[nd]

                    r2 = max(0, need2 - cur2)
                    r3 = max(0, need3 - cur3)
                    r5 = max(0, need5 - cur5)
                    r7 = max(0, need7 - cur7)

                    if min_digits(r2, r3, r5, r7) > n - i - 1:
                        continue

                    ans = list(num[:i])
                    ans.append(str(nd))

                    g2, g3, g5, g7 = cur2, cur3, cur5, cur7

                    # Greedily pick the smallest digits that satisfy the rest
                    for j in range(i + 1, n):
                        for d in range(1, 10):
                            rr2 = max(0, need2 - (g2 + p2[d]))
                            rr3 = max(0, need3 - (g3 + p3[d]))
                            rr5 = max(0, need5 - (g5 + p5[d]))
                            rr7 = max(0, need7 - (g7 + p7[d]))

                            if min_digits(rr2, rr3, rr5, rr7) <= n - j - 1:
                                ans.append(str(d))
                                g2 += p2[d]
                                g3 += p3[d]
                                g5 += p5[d]
                                g7 += p7[d]
                                break

                    return "".join(ans)

            return ""

        res = build_same_length()
        if res:
            return res

        # we couldn't find a same-length result, need a strictly longer number
        length = n + 1
        while min_digits(need2, need3, need5, need7) > length:
            length += 1

        ans = []
        g2 = g3 = g5 = g7 = 0

        for i in range(length):
            for d in range(1, 10):
                rr2 = max(0, need2 - (g2 + p2[d]))
                rr3 = max(0, need3 - (g3 + p3[d]))
                rr5 = max(0, need5 - (g5 + p5[d]))
                rr7 = max(0, need7 - (g7 + p7[d]))

                if min_digits(rr2, rr3, rr5, rr7) <= length - i - 1:
                    ans.append(str(d))
                    g2 += p2[d]
                    g3 += p3[d]
                    g5 += p5[d]
                    g7 += p7[d]
                    break

        return "".join(ans)