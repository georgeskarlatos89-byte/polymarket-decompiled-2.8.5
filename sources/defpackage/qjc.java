package defpackage;

import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class qjc implements ijc, vz9 {
    private zz9 _inspectorValues;

    public abstract jjc create();

    @Override // defpackage.vz9
    public final Sequence<m3k> getInspectableElements() {
        zz9 zz9Var = this._inspectorValues;
        if (zz9Var == null) {
            zz9Var = new zz9();
            zz9Var.a = lvf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
            inspectableProperties(zz9Var);
            this._inspectorValues = zz9Var;
        }
        return zz9Var.c;
    }

    @Override // defpackage.vz9
    public final String getNameFallback() {
        zz9 zz9Var = this._inspectorValues;
        if (zz9Var == null) {
            zz9Var = new zz9();
            zz9Var.a = lvf.a.getOrCreateKotlinClass(getClass()).getSimpleName();
            inspectableProperties(zz9Var);
            this._inspectorValues = zz9Var;
        }
        return zz9Var.a;
    }

    public abstract void inspectableProperties(zz9 zz9Var);

    public abstract void update(jjc jjcVar);
}
