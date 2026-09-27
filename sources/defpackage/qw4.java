package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.common.MlKitException;
import java.util.Arrays;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class qw4 extends g5 {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public final Integer e;
    public static final qw4 f = new qw4(0, null, null);
    public static final Parcelable.Creator<qw4> CREATOR = new o4l(4);

    public qw4(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
        this.e = num;
    }

    public static String O(int i) {
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case MlKitException.UNSUPPORTED /* 18 */:
                                return "SERVICE_UPDATING";
                            case zh4.REMOTE_EXCEPTION /* 19 */:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                                sb.append("UNKNOWN_ERROR_CODE(");
                                sb.append(i);
                                sb.append(")");
                                return sb.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qw4)) {
            return false;
        }
        qw4 qw4Var = (qw4) obj;
        if (this.b == qw4Var.b && dkn.b(this.c, qw4Var.c) && dkn.b(this.d, qw4Var.d) && dkn.b(this.e, qw4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final String toString() {
        ss9 ss9Var = new ss9(this);
        ss9Var.R(O(this.b), "statusCode");
        ss9Var.R(this.c, "resolution");
        ss9Var.R(this.d, "message");
        ss9Var.R(this.e, "clientMethodKey");
        return ss9Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int p = hxn.p(parcel, 20293);
        hxn.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        hxn.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        hxn.i(parcel, 3, this.c, i);
        hxn.j(parcel, 4, this.d);
        hxn.h(parcel, 5, this.e);
        hxn.q(parcel, p);
    }

    public qw4(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
