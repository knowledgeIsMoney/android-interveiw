## 如何计算bitmap大小？
ALPHA_8:只有alpha值，没有RGB值，占一个字节。计算：size=w*h
ARGB_4444:一个像素占用2个字节，alpha(A)值，Red（R）值，Green(G)值，Blue（B）值各占4个bites,共16bites，这种格式的图片，看起来质量太差，已经不推荐使用。计算：size=wh2
ARGB_8888:一个像素占用4个字节，alpha(A)值，Red（R）值，Green(G)值，Blue（B）值各占8个bites,共32bites,即4个字节。这是一种高质量的图片格式，电脑上普通采用的格式。android2.3开始的默认格式。计算：size=wh4
RGB_565:一个像素占用2个字节，没有alpha(A)值，即不支持透明和半透明，Red（R）值占5个bites ，Green(G)值占6个bites ，Blue（B）值占5个bites,共16bites,即2个字节。对于没有透明和半透明颜色的图片并且不需要颜色鲜艳的来说，该格式的图片能够达到比较的呈现效果，相对于ARGB_8888来说也能减少一半的内存开销，因此它是一个不错的选择。计算：size=wh2

作者：sligner
链接：https://www.jianshu.com/p/67cfd38c52dc
来源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
## bitmap如何优化？
