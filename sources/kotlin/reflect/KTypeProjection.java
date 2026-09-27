package kotlin.reflect;

import defpackage.ala;
import defpackage.bla;
import defpackage.dmk;
import defpackage.f27;
import defpackage.fla;
import defpackage.wka;
import io.ably.lib.rest.Auth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "c", "ala", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class KTypeProjection {
    public static final ala c = new ala(null);
    public static final KTypeProjection d = new KTypeProjection(null, null);
    public final fla a;
    public final wka b;

    public KTypeProjection(wka wkaVar, fla flaVar) {
        boolean z;
        String str;
        this.a = flaVar;
        this.b = wkaVar;
        if (flaVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (z == (wkaVar == null)) {
            return;
        }
        if (flaVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + flaVar + " requires type to be specified.";
        }
        f27.q(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        if (this.a == kTypeProjection.a && Intrinsics.areEqual(this.b, kTypeProjection.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        fla flaVar = this.a;
        if (flaVar == null) {
            hashCode = 0;
        } else {
            hashCode = flaVar.hashCode();
        }
        int i2 = hashCode * 31;
        wka wkaVar = this.b;
        if (wkaVar != null) {
            i = wkaVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        int i;
        fla flaVar = this.a;
        if (flaVar == null) {
            i = -1;
        } else {
            i = bla.a[flaVar.ordinal()];
        }
        if (i != -1) {
            wka wkaVar = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + wkaVar;
                    }
                    dmk.a();
                    return null;
                }
                return "in " + wkaVar;
            }
            return String.valueOf(wkaVar);
        }
        return Auth.WILDCARD_CLIENTID;
    }
}
