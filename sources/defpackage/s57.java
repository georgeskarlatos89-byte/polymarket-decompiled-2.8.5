package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class s57 {
    public static final ArrayList c = new ArrayList();
    public final CharsetEncoder[] a;
    public final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (tj3.b(str) != null) {
                try {
                    c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public s57(String str, Charset charset) {
        boolean z;
        int i;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        if (charset != null && charset.name().startsWith("UTF")) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= str.length()) {
                break;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                char charAt = str.charAt(i3);
                if (charAt == 65535 || charsetEncoder.canEncode(charAt)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!z2) {
                Iterator it2 = c.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CharsetEncoder charsetEncoder2 = (CharsetEncoder) it2.next();
                    if (charsetEncoder2.canEncode(str.charAt(i3))) {
                        arrayList.add(charsetEncoder2);
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                z = true;
            }
            i3++;
        }
        if (arrayList.size() == 1 && !z) {
            this.a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        } else {
            this.a = new CharsetEncoder[arrayList.size() + 2];
            Iterator it3 = arrayList.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                this.a[i4] = (CharsetEncoder) it3.next();
                i4++;
            }
            this.a[i4] = StandardCharsets.UTF_8.newEncoder();
            this.a[i4 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.a;
                if (i2 < charsetEncoderArr.length) {
                    if (charsetEncoderArr[i2] != null && charset.name().equals(this.a[i2].charset().name())) {
                        i = i2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        this.b = i;
    }
}
