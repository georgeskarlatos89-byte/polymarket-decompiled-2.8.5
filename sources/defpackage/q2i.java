package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class q2i extends aj3 {
    public int a;
    public final /* synthetic */ CharSequence b;

    public q2i(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // defpackage.aj3
    public final char a() {
        int i = this.a;
        this.a = i + 1;
        return this.b.charAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a < this.b.length()) {
            return true;
        }
        return false;
    }
}
