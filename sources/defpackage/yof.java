package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public interface yof extends ws4 {
    @Override // defpackage.ws4
    default Object a(ow0 ow0Var, Object obj) {
        return getConfig().a(ow0Var, obj);
    }

    @Override // defpackage.ws4
    default Set b() {
        return getConfig().b();
    }

    @Override // defpackage.ws4
    default Set c(ow0 ow0Var) {
        return getConfig().c(ow0Var);
    }

    @Override // defpackage.ws4
    default void d(vt0 vt0Var) {
        getConfig().d(vt0Var);
    }

    @Override // defpackage.ws4
    default boolean e(ow0 ow0Var) {
        return getConfig().e(ow0Var);
    }

    @Override // defpackage.ws4
    default vs4 f(ow0 ow0Var) {
        return getConfig().f(ow0Var);
    }

    ws4 getConfig();

    @Override // defpackage.ws4
    default Object h(ow0 ow0Var) {
        return getConfig().h(ow0Var);
    }

    @Override // defpackage.ws4
    default Object i(ow0 ow0Var, vs4 vs4Var) {
        return getConfig().i(ow0Var, vs4Var);
    }
}
