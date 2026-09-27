package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.ThreadParticipant;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class lki implements Comparator {
    public static final /* synthetic */ lki b = new lki(8);
    public static final /* synthetic */ lki c = new lki(9);
    public static final /* synthetic */ lki d = new lki(17);
    public final /* synthetic */ int a;

    public /* synthetic */ lki(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l;
        switch (this.a) {
            case 0:
                return qi4.b(((jki) obj).a, ((jki) obj2).a);
            case 1:
                long j = Long.MIN_VALUE;
                Date lastThreadMessageAt = ((ThreadParticipant) obj2).getLastThreadMessageAt();
                if (lastThreadMessageAt != null) {
                    l = Long.valueOf(lastThreadMessageAt.getTime());
                } else {
                    l = Long.MIN_VALUE;
                }
                Date lastThreadMessageAt2 = ((ThreadParticipant) obj).getLastThreadMessageAt();
                if (lastThreadMessageAt2 != null) {
                    j = Long.valueOf(lastThreadMessageAt2.getTime());
                }
                return l.compareTo(j);
            case 2:
                return qi4.b(pgn.d((Message) obj), pgn.d((Message) obj2));
            case 3:
                return qi4.b(pgn.d((Message) obj), pgn.d((Message) obj2));
            case 4:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 5:
                return qi4.b(((ejj) obj).c, ((ejj) obj2).c);
            case 6:
                return ((rak) obj).b - ((rak) obj2).b;
            case 7:
                return qi4.b(((prk) obj).a, ((prk) obj2).a);
            case 8:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 9:
                gw7 gw7Var = (gw7) obj2;
                gw7 gw7Var2 = (gw7) obj;
                if (!gw7Var2.a.equals(gw7Var.a)) {
                    return gw7Var2.a.compareTo(gw7Var.a);
                }
                return Long.compare(gw7Var2.O(), gw7Var.O());
            case 10:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 11:
                h6l a = h6l.a(obj);
                h6l a2 = h6l.a(obj2);
                if (a == a2) {
                    int ordinal = a.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                return a.compareTo(a2);
            case 12:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            case 14:
                ipl a3 = ipl.a(obj);
                ipl a4 = ipl.a(obj2);
                if (a3 == a4) {
                    int ordinal2 = a3.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                return a3.compareTo(a4);
            case 15:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 16:
                cb cbVar = (cb) obj;
                cb cbVar2 = (cb) obj2;
                arn.h(cbVar);
                arn.h(cbVar2);
                int i = cbVar.a;
                int i2 = cbVar2.a;
                if (i != i2) {
                    if (i >= i2) {
                        return 1;
                    }
                } else {
                    int i3 = cbVar.b;
                    int i4 = cbVar2.b;
                    if (i3 == i4) {
                        return 0;
                    }
                    if (i3 >= i4) {
                        return 1;
                    }
                }
                return -1;
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
