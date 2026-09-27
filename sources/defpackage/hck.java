package defpackage;

import java.util.UUID;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hck extends hl8 {
    public final String b;
    public int c;

    public hck(x03 x03Var) {
        super(x03Var);
        this.b = "virtual-" + x03Var.f() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.hl8, defpackage.x03
    public final int e() {
        return q(0);
    }

    @Override // defpackage.hl8, defpackage.x03
    public final String f() {
        return this.b;
    }

    @Override // defpackage.hl8, defpackage.x03
    public final int q(int i) {
        return kbj.i(this.a.q(i) - this.c);
    }
}
