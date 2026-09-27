package defpackage;

import com.checkout.components.card.operations.tokenisation.network.model.TokenRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class a93 {
    public final TokenRequest a;
    public final Function0 b;
    public final Function0 c;
    public final String d;

    public a93(TokenRequest tokenRequest, Function0 function0, Function0 function02, String str) {
        this.a = tokenRequest;
        this.b = function0;
        this.c = function02;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a93) {
                a93 a93Var = (a93) obj;
                if (!Intrinsics.areEqual(this.a, a93Var.a) || !Intrinsics.areEqual(this.b, a93Var.b) || !Intrinsics.areEqual(this.c, a93Var.c) || !Intrinsics.areEqual(this.d, a93Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CardTokenRequest(tokenRequest=" + this.a + ", onSuccess=" + this.b + ", onFailure=" + this.c + ", rememberMeJWTToken=" + this.d + ")";
    }
}
