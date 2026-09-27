package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class df3 extends mg7 {
    @Override // defpackage.mg7
    public final void a(lcg lcgVar, Object obj) {
        lh4 lh4Var = (lh4) obj;
        lcgVar.getClass();
        lh4Var.getClass();
        lcgVar.H(1, lh4Var.a);
        lcgVar.H(2, lh4Var.b);
        lcgVar.H(3, lh4Var.c);
        lcgVar.H(4, lh4Var.d);
        lcgVar.H(5, lh4Var.e);
        lcgVar.l(6, lh4Var.f);
    }

    @Override // defpackage.mg7
    public final String b() {
        return "INSERT OR REPLACE INTO `command_inner_entity` (`name`,`description`,`args`,`set`,`channelType`,`id`) VALUES (?,?,?,?,?,?)";
    }
}
