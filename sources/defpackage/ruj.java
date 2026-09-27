package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ruj extends nuj {
    @Override // defpackage.nuj
    public final puj a(Object obj) {
        ts8 ts8Var = (ts8) obj;
        puj pujVar = ts8Var.unknownFields;
        if (pujVar == puj.f) {
            puj pujVar2 = new puj(0, new int[8], new Object[8], true);
            ts8Var.unknownFields = pujVar2;
            return pujVar2;
        }
        return pujVar;
    }
}
