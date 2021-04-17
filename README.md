# Test NetBeans IDE massive output from test

The application prints 10,000 lines of a random string of 80 chars
to stdout:

```text
0000000001 #[[>UOD-.b-u6ypiEO=d!}c|I4N\K1_T``-=S:B4utto,i-8ca_{t&J%hNHmjQtFOK_j"*kfNy K8Ej4
0000000002 1lwZpQV%pPY"-vq,JW3LXFd QltJps:cJAP'CG%77Fw7?^5^k)\n.e@|jl&$T|>s3(55fi=pQFA5tN)G
0000000003 zm]xl1G:"2j_TJrHV)G\?r 4!I.$LzVX=?saW3>8s,) ql]01?J<=/'U2F=+J~G]h%m0_Qs4/sBr0:Of
0000000004 s.P[2LQc-e99N;H'wh*~w^&])|5G(Pu%x a.7*FM'ad<TEtJ\RT8!6+l%uz&e"_|ev:@W"QHYfXjX#OZ
...
...
0000009999 C3tAZN3;MLo=NV8MBvEYt<WER$)e[*8VMuKFZ,S#<,Pk8F-!du_*7-2i[,};p*GiLtKEM*#eCfV%Yr+"
0000010000 2!pC~d U+n@Qb%o$8z&m8VBN|F*$]00bAgEyc1#xQ>4w*3W"NMtB(b*<$(i]%C?0U@$(lXbewR69<QhV
```

## Problem

When the application is executed it performs well in both NetBeans IDE and Intellij IDEA: The 
"Output Window" is able to consume the messages at a very rapid pace.

When the same is executed as a JUnit 5 test using Maven Surefire Plugin it performs extremely 
poorly in NetBeans IDE while Intellij IDEA exhibits same behaviour as in the non-test case, meaning
it just as fast.

In fact, in the test scenario NetBeans IDE is so slow to consume the messages that one needs to
increase the Surefire Plugin's property `forkedProcessExitTimeoutInSeconds` from 30s to a lot more in 
order to avoid that Surefire will kill its forked process before all messages has been
forwarded into the IDE.

