package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class pg0 extends ol8 {
    public final /* synthetic */ wg0 j;
    public final /* synthetic */ zg0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(zg0 zg0Var, zg0 zg0Var2, wg0 wg0Var) {
        super(zg0Var2);
        this.k = zg0Var;
        this.j = wg0Var;
    }

    @Override // defpackage.ol8
    public final y5h b() {
        return this.j;
    }

    @Override // defpackage.ol8
    public final boolean c() {
        zg0 zg0Var = this.k;
        if (!zg0Var.getInternalPopup().a()) {
            zg0Var.f.k(zg0Var.getTextDirection(), zg0Var.getTextAlignment());
            return true;
        }
        return true;
    }
}
