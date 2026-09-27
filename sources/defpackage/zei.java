package defpackage;

import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class zei extends q55 implements tp8 {
    private final int arity;

    public zei(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // defpackage.tp8
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.l81
    public String toString() {
        if (getCompletion() == null) {
            String renderLambdaToString = lvf.a.renderLambdaToString(this);
            renderLambdaToString.getClass();
            return renderLambdaToString;
        }
        return super.toString();
    }
}
