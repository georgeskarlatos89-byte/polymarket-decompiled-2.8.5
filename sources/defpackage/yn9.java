package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yn9 extends e19 {
    public final int b = 1;
    public final bx7 c = bx7.IMAGE_FORMAT;

    @Override // defpackage.e19
    public final bx7 a() {
        return this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                str = "UNDEFINED(" + i + ')';
            } else {
                str = "JPEG_R";
            }
        } else {
            str = "JPEG";
        }
        return m51.m(sb, str, ')');
    }
}
