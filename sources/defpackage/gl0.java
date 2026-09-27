package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class gl0 extends b3 {
    public int c = -1;
    public final /* synthetic */ hl0 d;

    public gl0(hl0 hl0Var) {
        this.d = hl0Var;
    }

    @Override // defpackage.b3
    public final void a() {
        int i;
        Object[] objArr;
        do {
            i = this.c + 1;
            this.c = i;
            objArr = this.d.a;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.a = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.b = obj;
        this.a = 1;
    }
}
