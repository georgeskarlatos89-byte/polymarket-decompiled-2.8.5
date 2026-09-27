package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.dmk;
import defpackage.dwl;
import defpackage.g5;
import defpackage.hm6;
import defpackage.hwl;
import defpackage.hxn;
import defpackage.rnl;
import defpackage.rwl;
import defpackage.tvl;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001dBS\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rBc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J+\u0010)\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b)\u0010*J+\u0010+\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b+\u0010*JC\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b,\u0010-J+\u0010.\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b2\u00101J+\u00103\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040'\"\u00020\u0004H\u0007¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b4\u00101J\u000f\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b7\u00106J-\u0010:\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\tH\u0007¢\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00042\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\b=\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010KR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020L8G¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100L8G¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010PR\u001e\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170L8Ç\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010NR\u0011\u0010R\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0011\u0010T\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bT\u0010SR\u0011\u0010U\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bU\u0010SR\u0011\u0010V\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bV\u0010SR\u0011\u0010W\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\bW\u0010SR\u001e\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00170L8Ç\u0002¢\u0006\u0006\u001a\u0004\bX\u0010NR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bY\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bZ\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000e\u0010[\u001a\u0004\b\\\u0010\u001bR\u0011\u0010^\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\b]\u00106R\u001a\u0010\u0003\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010[\u001a\u0004\b_\u0010\u001bR\u0011\u0010c\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\ba\u0010b¨\u0006e"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "Lg5;", "", "uid", "", "packageName", "attributionTag", "listenerId", "", "Lgw7;", "clientFeatures", "impersonator", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "pid", "clientSdkVersion", "Lcom/google/android/gms/libs/identity/ClientType;", "clientType", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "asImpersonator", "(Landroid/content/Context;)Lcom/google/android/gms/libs/identity/Impersonator;", "", "permissions", "checkAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "enforceAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceFirstParty", "(Landroid/content/Context;)V", "enforcePackageName", "enforcePermissions", "enforceZeroParty", "forAggregation", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "getImpersonator", "impersonatee", "impersonateeListenerId", "impersonate", "(Landroid/content/Context;Lcom/google/android/gms/libs/identity/ClientIdentity;Ljava/lang/String;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "feature", "supportsFeature", "(Lgw7;)Z", Keys.KEY_NAME, "", "version", "(Ljava/lang/String;J)Z", "_clientSdkVersion", "Ljava/lang/Integer;", "_clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "Ljava/lang/String;", "getAttributionTag", "Ljava/util/List;", "getClientFeatures", "()Ljava/util/List;", "Lkotlin/Function1;", "getClientSdkVersion", "()Lkotlin/jvm/functions/Function1;", "getClientType", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "isFirstParty", "isImpersonatedIdentity", "()Z", "isMyProcess", "isMyUid", "isMyUser", "isSystemServer", "isZeroParty", "getListenerId", "getPackageName", "I", "getPid", "getRealIdentity", "realIdentity", "getUid", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "userHandle", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.google.android.gms.internal.location.zze, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class ClientIdentity extends g5 {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final List e;
    private final ClientIdentity f;
    public static final rnl g = new rnl(null);
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new rwl(2);

    static {
        Process.myUid();
        Process.myPid();
    }

    @hm6
    public ClientIdentity(int i, String str, String str2, String str3, List list, ClientIdentity clientIdentity) {
        str.getClass();
        if (clientIdentity != null && clientIdentity.zza()) {
            dmk.v("Failed requirement.");
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str3 == null) {
            if (clientIdentity != null) {
                str3 = clientIdentity.d;
            } else {
                str3 = null;
            }
        }
        this.d = str3;
        if (list == null) {
            if (clientIdentity != null) {
                list = clientIdentity.e;
            } else {
                list = null;
            }
            if (list == null) {
                tvl tvlVar = dwl.b;
                list = hwl.e;
                list.getClass();
            }
        }
        dwl i2 = dwl.i(list);
        i2.getClass();
        this.e = i2;
        this.f = clientIdentity;
    }

    public final boolean equals(Object other) {
        if (other instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) other;
            if (this.a == clientIdentity.a && Intrinsics.areEqual(this.b, clientIdentity.b) && Intrinsics.areEqual(this.c, clientIdentity.c) && Intrinsics.areEqual(this.d, clientIdentity.d) && Intrinsics.areEqual(this.f, clientIdentity.f) && Intrinsics.areEqual(this.e, clientIdentity.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        int i;
        int length = this.b.length() + 18;
        String str = this.c;
        int i2 = 0;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(length + i);
        sb.append(this.a);
        sb.append(AgentHeaderCreator.AGENT_DIVIDER);
        sb.append(this.b);
        String str2 = this.c;
        if (str2 != null) {
            sb.append("[");
            if (e.u(str2, this.b, false)) {
                sb.append((CharSequence) str2, this.b.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.d != null) {
            sb.append(AgentHeaderCreator.AGENT_DIVIDER);
            String str3 = this.d;
            if (str3 != null) {
                i2 = str3.hashCode();
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        int i = this.a;
        int p = hxn.p(dest, 20293);
        hxn.o(dest, 1, 4);
        dest.writeInt(i);
        hxn.j(dest, 3, this.b);
        hxn.j(dest, 4, this.c);
        hxn.j(dest, 6, this.d);
        hxn.i(dest, 7, this.f, flags);
        hxn.n(dest, 8, this.e);
        hxn.q(dest, p);
    }

    public final boolean zza() {
        if (this.f != null) {
            return true;
        }
        return false;
    }
}
