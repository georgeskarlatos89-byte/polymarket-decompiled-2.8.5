package defpackage;

import androidx.compose.ui.text.input.OffsetMapping;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class ple implements OffsetMapping {
    public final /* synthetic */ qle a;

    public ple(qle qleVar) {
        this.a = qleVar;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int s(int i) {
        String str = this.a.c.c;
        if (str == null) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        String substring = str.substring(0, Math.min(i, str.length()));
        StringBuilder sb = new StringBuilder();
        int length = substring.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = substring.charAt(i2);
            if (charAt != '#') {
                sb.append(charAt);
            }
        }
        int length2 = sb.toString().length();
        if (i > str.length()) {
            length2++;
        }
        return i - length2;
    }

    @Override // androidx.compose.ui.text.input.OffsetMapping
    public final int v(int i) {
        String str = this.a.c.c;
        if (str == null) {
            return i;
        }
        if (i == 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < str.length(); i5++) {
            i2++;
            if (str.charAt(i5) == '#' && (i3 = i3 + 1) == i) {
                i4 = i2;
            }
        }
        if (i4 == -1) {
            return (i - i3) + str.length() + 1;
        }
        return i4;
    }
}
