package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class tf1 extends o8d {
    @Override // defpackage.o8d
    public final void c(o8d o8dVar) {
        if (o8dVar instanceof tf1) {
            this.a = o8dVar;
        } else {
            dmk.v("Parent of block must also be block (can not be inline)");
        }
    }
}
