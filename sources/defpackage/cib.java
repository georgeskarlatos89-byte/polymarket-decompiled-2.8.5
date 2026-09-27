package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class cib extends zhb {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cib(fib fibVar, int i) {
        super(fibVar);
        this.f = i;
    }

    @Override // defpackage.zhb, java.util.Iterator
    public Object next() {
        switch (this.f) {
            case 1:
                return b().f;
            default:
                return super.next();
        }
    }
}
