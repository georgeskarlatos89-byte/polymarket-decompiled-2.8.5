package defpackage;

import io.getstream.chat.android.models.Message;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class tec {
    public final Message a;
    public final Message b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public tec(Message message, Message message2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = message;
        this.b = message2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public static tec a(tec tecVar, Message message, Message message2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            message = tecVar.a;
        }
        Message message3 = message;
        if ((i & 2) != 0) {
            message2 = tecVar.b;
        }
        Message message4 = message2;
        if ((i & 4) != 0) {
            z = tecVar.c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z2 = tecVar.d;
        }
        boolean z7 = z2;
        if ((i & 16) != 0) {
            z3 = tecVar.e;
        }
        boolean z8 = z3;
        if ((i & 32) != 0) {
            z4 = tecVar.f;
        }
        boolean z9 = z4;
        if ((i & 64) != 0) {
            z5 = tecVar.g;
        }
        tecVar.getClass();
        return new tec(message3, message4, z6, z7, z8, z9, z5);
    }

    public final boolean b(Message message) {
        Date date;
        Date date2;
        Date date3;
        message.getClass();
        Date c = pgn.c(message, jdc.a);
        Date date4 = null;
        Message message2 = this.a;
        if (message2 != null) {
            date = message2.getCreatedAt();
        } else {
            date = null;
        }
        if (date != null) {
            if (message2 != null) {
                date3 = message2.getCreatedAt();
            } else {
                date3 = null;
            }
            if (c.compareTo(date3) < 0) {
                return false;
            }
        }
        Message message3 = this.b;
        if (message3 != null) {
            date2 = message3.getCreatedAt();
        } else {
            date2 = null;
        }
        if (date2 != null) {
            if (message3 != null) {
                date4 = message3.getCreatedAt();
            }
            if (c.compareTo(date4) > 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tec)) {
            return false;
        }
        tec tecVar = (tec) obj;
        if (Intrinsics.areEqual(this.a, tecVar.a) && Intrinsics.areEqual(this.b, tecVar.b) && this.c == tecVar.c && this.d == tecVar.d && this.e == tecVar.e && this.f == tecVar.f && this.g == tecVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Message message = this.a;
        if (message == null) {
            hashCode = 0;
        } else {
            hashCode = message.hashCode();
        }
        int i2 = hashCode * 31;
        Message message2 = this.b;
        if (message2 != null) {
            i = message2.hashCode();
        }
        return Boolean.hashCode(this.g) + hdi.g(hdi.g(hdi.g(hdi.g((i2 + i) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesPaginationState(oldestMessage=");
        sb.append(this.a);
        sb.append(", newestMessage=");
        sb.append(this.b);
        sb.append(", hasLoadedAllNextMessages=");
        hdi.B(sb, this.c, ", hasLoadedAllPreviousMessages=", this.d, ", isLoadingNextMessages=");
        hdi.B(sb, this.e, ", isLoadingPreviousMessages=", this.f, ", isLoadingMiddleMessages=");
        return ix2.r(sb, this.g, ")");
    }

    public /* synthetic */ tec() {
        this(null, null, true, false, false, false, false);
    }
}
