package defpackage;

import io.getstream.chat.android.models.Message;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract class rva {
    public static final Object a = new Object();
    public static ExecutorService b;

    public static final void a(vl4 vl4Var, pq4 pq4Var, int i) {
        boolean z;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.g0(-1162635549);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sr8Var.V(i & 1, z)) {
            sqn.a(rpg.a.a(null), vl4Var, sr8Var, 56);
        } else {
            sr8Var.Y();
        }
        nrf u = sr8Var.u();
        if (u != null) {
            u.d = new qm(vl4Var, i, 25);
        }
    }

    public static final Date e(String str, Collection collection) {
        collection.getClass();
        Comparable comparable = null;
        if (str == null) {
            return null;
        }
        q18 q18Var = new q18(pwg.o(new tl0(collection, 1), new dd(str, 28)));
        if (q18Var.hasNext()) {
            Comparable comparable2 = (Comparable) q18Var.next();
            loop0: while (true) {
                comparable = comparable2;
                while (q18Var.hasNext()) {
                    comparable2 = (Comparable) q18Var.next();
                    if (comparable.compareTo(comparable2) < 0) {
                        break;
                    }
                }
            }
        }
        return (Date) comparable;
    }

    public static final Date f(Message message, String str) {
        message.getClass();
        str.getClass();
        if (!Intrinsics.areEqual(message.getUser().getId(), str) || message.getParentId() == null || message.getShowInChannel() || message.getShadowed()) {
            return null;
        }
        Date createdLocallyAt = message.getCreatedLocallyAt();
        if (createdLocallyAt == null) {
            return message.getCreatedAt();
        }
        return createdLocallyAt;
    }

    public abstract kjc b();

    public abstract kjc c();

    public abstract xxi d();
}
