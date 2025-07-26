This program checks whether a given string is a palindrome using the two-pointer technique.

> What is a Palindrome?
A palindrome is a string that reads the same forward and backward (e.g., "madam", "racecar", "rar").

> How the Code Works:
A string s = "rar" is given.

Two pointers l (left) and r (right) are initialized at the beginning and end of the string.

The program compares characters at positions l and r:

If they match: move inward (l++, r--) and increment counter h.

If they don’t match: break the loop (not a palindrome).

After the loop, if h == s.length() / 2, it means all characters matched properly.

The program prints:

"yes" → if the string is a palindrome.

"no" → otherwise.

🧪 Example Output:
For s = "rar" → "yes" (it is a palindrome)

For s = "race" → "no" (not a palindrome)

🔧 Technique Used:
Two-Pointer Technique, commonly used in string and array problems to optimize comparisons.
