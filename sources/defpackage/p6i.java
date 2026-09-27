package defpackage;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class p6i {
    public static final String b = gn.EC.toString();
    public final a36 a;

    public p6i(a36 a36Var) {
        this.a = a36Var;
    }

    public final KeyPair a() {
        Object m882constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(b);
            keyPairGenerator.initialize(new ECGenParameterSpec(lg5.c.b));
            m882constructorimpl = Result.m882constructorimpl(keyPairGenerator.generateKeyPair());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m882constructorimpl = Result.m882constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m883exceptionOrNullimpl = Result.m883exceptionOrNullimpl(m882constructorimpl);
        if (m883exceptionOrNullimpl != null) {
            this.a.b(m883exceptionOrNullimpl);
        }
        Throwable m883exceptionOrNullimpl2 = Result.m883exceptionOrNullimpl(m882constructorimpl);
        if (m883exceptionOrNullimpl2 == null) {
            m882constructorimpl.getClass();
            return (KeyPair) m882constructorimpl;
        }
        throw new zbg(m883exceptionOrNullimpl2);
    }
}
