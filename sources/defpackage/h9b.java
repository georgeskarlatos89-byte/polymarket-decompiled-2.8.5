package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.ConsumerSession$AuthenticationLevel;
import com.stripe.android.model.MobileFallbackWebviewParams$WebviewRequirementType;
import io.ably.lib.rest.Auth;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class h9b implements Parcelable {
    public static final Parcelable.Creator<h9b> CREATOR = new v5a(7);
    public final r15 a;
    public final String b;
    public final zv6 c;
    public final ccb d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final f8 k;
    public final String l;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h9b(r15 r15Var, String str, zv6 zv6Var, ccb ccbVar, boolean z) {
        Object obj;
        boolean z2;
        Object obj2;
        f8 b8Var;
        String str2;
        ix4 ix4Var;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel2;
        r15Var.getClass();
        this.a = r15Var;
        this.b = str;
        this.c = zv6Var;
        this.d = ccbVar;
        this.e = z;
        this.f = e.s(r15Var.c, Auth.WILDCARD_CLIENTID, "•");
        this.g = r15Var.a;
        this.h = r15Var.b;
        ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel3 = r15Var.i;
        if ((consumerSession$AuthenticationLevel3 == null || (consumerSession$AuthenticationLevel2 = r15Var.j) == null || consumerSession$AuthenticationLevel3.getSortOrder() < consumerSession$AuthenticationLevel2.getSortOrder()) && !g(r15Var)) {
            Iterator it = r15Var.g.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    q15 q15Var = (q15) obj;
                    if (q15Var.a == p15.LinkAuthToken && q15Var.b == n15.Verified) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                z2 = false;
                this.i = z2;
                this.j = g(this.a);
                r15 r15Var2 = this.a;
                if (!z2) {
                    ccb ccbVar2 = this.d;
                    if (ccbVar2 != null) {
                        ix4Var = ccbVar2.b;
                    } else {
                        ix4Var = null;
                    }
                    ConsumerSession$AuthenticationLevel consumerSession$AuthenticationLevel4 = r15Var2.i;
                    b8Var = new e8(ix4Var, (consumerSession$AuthenticationLevel4 == null || (consumerSession$AuthenticationLevel = r15Var2.j) == null || consumerSession$AuthenticationLevel4.getSortOrder() < consumerSession$AuthenticationLevel.getSortOrder()) ? false : true);
                } else {
                    Iterator it2 = r15Var2.g.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            q15 q15Var2 = (q15) obj2;
                            if (q15Var2.a == p15.Sms && q15Var2.b == n15.Started) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    if (obj2 != null) {
                        b8Var = d8.a;
                    } else {
                        ghc ghcVar = this.a.h;
                        b8Var = new b8((ghcVar == null || (str2 = ghcVar.b) == null || ghcVar.a != MobileFallbackWebviewParams$WebviewRequirementType.Required) ? null : str2);
                    }
                }
                this.k = b8Var;
                ghc ghcVar2 = this.a.h;
                this.l = ghcVar2 != null ? ghcVar2.b : null;
            }
        }
        z2 = true;
        this.i = z2;
        this.j = g(this.a);
        r15 r15Var22 = this.a;
        if (!z2) {
        }
        this.k = b8Var;
        ghc ghcVar22 = this.a.h;
        this.l = ghcVar22 != null ? ghcVar22.b : null;
    }

    public static boolean g(r15 r15Var) {
        Object obj;
        Iterator it = r15Var.g.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                q15 q15Var = (q15) obj;
                if (q15Var.a == p15.SignUp && q15Var.b == n15.Started) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        r15 r15Var = this.a;
        String str = r15Var.e;
        String str2 = r15Var.f;
        if (str != null && str2 != null) {
            lj3 lj3Var = rle.a;
            return ron.a(str2).e(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9b)) {
            return false;
        }
        h9b h9bVar = (h9b) obj;
        if (Intrinsics.areEqual(this.a, h9bVar.a) && Intrinsics.areEqual(this.b, h9bVar.b) && Intrinsics.areEqual(this.c, h9bVar.c) && Intrinsics.areEqual(this.d, h9bVar.d) && this.e == h9bVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        zv6 zv6Var = this.c;
        if (zv6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zv6Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ccb ccbVar = this.d;
        if (ccbVar != null) {
            i = ccbVar.hashCode();
        }
        return Boolean.hashCode(this.e) + ((i3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkAccount(consumerSession=");
        sb.append(this.a);
        sb.append(", consumerPublishableKey=");
        sb.append(this.b);
        sb.append(", displayablePaymentDetails=");
        sb.append(this.c);
        sb.append(", linkAuthIntentInfo=");
        sb.append(this.d);
        sb.append(", viewedWebviewOpenUrl=");
        return ix2.r(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        ccb ccbVar = this.d;
        if (ccbVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ccbVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
