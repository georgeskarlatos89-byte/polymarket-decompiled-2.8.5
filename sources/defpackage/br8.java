package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class br8 extends wh4 {
    public static final br8 g = new br8(new int[0], new char[0], new boolean[0], 0, false);
    public final boolean f;

    public br8(int[] iArr, char[] cArr, boolean[] zArr, int i, boolean z) {
        super(iArr, cArr, zArr, i);
        this.f = z;
    }

    @Override // defpackage.wh4
    public final wh4 d(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        char c;
        boolean z = true;
        char c2 = cArr[cArr.length - 1];
        if (c2 < 128) {
            c = c2;
        } else {
            c = (char) (c2 - 'd');
        }
        cArr[cArr.length - 1] = c;
        if (c2 == c) {
            z = false;
        }
        return new br8(iArr, cArr, zArr, i, z);
    }

    @Override // defpackage.wh4
    public final sh4 e(wub wubVar) {
        wubVar.getClass();
        sh4 e = super.e(wubVar);
        int i = wubVar.b;
        if (e == null) {
            return null;
        }
        int i2 = e.a;
        String str = wubVar.d;
        int i3 = i + i2;
        while (i3 < str.length() && (str.charAt(i3) == ' ' || str.charAt(i3) == '\t')) {
            i3++;
        }
        int i4 = i3 + 3;
        if (i4 <= str.length() && str.charAt(i3) == '[' && str.charAt(i3 + 2) == ']') {
            int i5 = i3 + 1;
            if (str.charAt(i5) == 'x' || str.charAt(i5) == 'X' || str.charAt(i5) == ' ') {
                return new sh4((char) (e.b + 'd'), i4 - i, i2);
            }
        }
        return e;
    }

    @Override // defpackage.wh4
    public final wh4 f() {
        return g;
    }
}
