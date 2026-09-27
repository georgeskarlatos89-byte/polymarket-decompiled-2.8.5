package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class jj3 extends aj3 {
    public final int a;
    public boolean b;
    public int c;

    public jj3(char c, char c2) {
        boolean z;
        this.a = c2;
        if (c <= c2) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.c = z ? c : c2;
    }

    @Override // defpackage.aj3
    public final char a() {
        int i = this.c;
        if (i == this.a) {
            if (this.b) {
                this.b = false;
            } else {
                dmk.t();
                return (char) 0;
            }
        } else {
            this.c = i + 1;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }
}
