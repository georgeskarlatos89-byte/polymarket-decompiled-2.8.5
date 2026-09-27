package defpackage;

import com.socure.docv.capturesdk.common.utils.ApiConstant;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jt0 extends Exception {
    public jt0(String str, it0 it0Var) {
        super(str + ApiConstant.SPACE + it0Var);
    }

    public jt0(it0 it0Var) {
        this("Unhandled input format:", it0Var);
    }
}
