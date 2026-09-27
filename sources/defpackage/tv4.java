package defpackage;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import com.polymarket.clients.ClientChatMessage;
import io.getstream.chat.android.models.Location;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.ReactionGroup;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tv4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ tv4(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        float y;
        switch (this.a) {
            case 0:
                return ((qu4) obj).getKey().compareTo(((qu4) obj2).getKey());
            case 1:
                return Long.compare(((f55) obj).b, ((f55) obj2).b);
            case 2:
                WeakHashMap weakHashMap = k9k.a;
                float z3 = ((View) obj).getZ();
                float z4 = ((View) obj2).getZ();
                if (z3 > z4) {
                    return -1;
                }
                if (z3 < z4) {
                    return 1;
                }
                return 0;
            case 3:
                Date date = jdc.a;
                return qi4.b(pgn.c((Message) obj, date), pgn.c((Message) obj2, date));
            case 4:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                int d = Intrinsics.d(layoutNode.q, layoutNode2.q);
                if (d == 0) {
                    return Intrinsics.d(layoutNode.hashCode(), layoutNode2.hashCode());
                }
                return d;
            case 5:
                return qi4.b(((File) obj).getName(), ((File) obj2).getName());
            case 6:
                return ((rs6) obj).a - ((rs6) obj2).a;
            case 7:
                yr8 yr8Var = (yr8) obj;
                yr8 yr8Var2 = (yr8) obj2;
                RecyclerView recyclerView = yr8Var.d;
                if (recyclerView == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (yr8Var2.d == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                    if (recyclerView == null) {
                        return 1;
                    }
                } else {
                    boolean z5 = yr8Var.a;
                    if (z5 != yr8Var2.a) {
                        if (!z5) {
                            return 1;
                        }
                    } else {
                        int i = yr8Var2.b - yr8Var.b;
                        if (i == 0) {
                            int i2 = yr8Var.c - yr8Var2.c;
                            if (i2 == 0) {
                                return 0;
                            }
                            return i2;
                        }
                        return i;
                    }
                }
                return -1;
            case 8:
                return Double.valueOf(((l59) obj2).c).compareTo(Double.valueOf(((l59) obj).c));
            case 9:
                return qi4.b(fnn.b((Charset) obj), fnn.b((Charset) obj2));
            case 10:
                return qi4.b((Float) ((Pair) obj2).getSecond(), (Float) ((Pair) obj).getSecond());
            case 11:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 12:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 13:
                return qi4.b(((ReactionGroup) obj).getFirstReactionAt(), ((ReactionGroup) obj2).getFirstReactionAt());
            case 14:
                return qi4.b(((ClientChatMessage) obj).getCreatedAt(), ((ClientChatMessage) obj2).getCreatedAt());
            case 15:
                return qi4.b((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 16:
                return qi4.b(((Location) obj).getMessageId(), ((Location) obj2).getMessageId());
            case 17:
                return Integer.valueOf(((h6b) ((IndexedValue) obj).b).g).compareTo(Integer.valueOf(((h6b) ((IndexedValue) obj2).b).g));
            case MlKitException.UNSUPPORTED /* 18 */:
                return Integer.valueOf(((uvd) obj2).a).compareTo(Integer.valueOf(((uvd) obj).a));
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return qi4.b(((cgc) obj).a, ((cgc) obj2).a);
            case 20:
                return ((ceh) obj).b - ((ceh) obj2).b;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((jhd) obj2).getClass();
                Integer num = 2;
                ((jhd) obj).getClass();
                return num.compareTo(num);
            case 22:
                ((iv8) obj2).getClass();
                Integer num2 = 0;
                ((iv8) obj).getClass();
                return num2.compareTo(num2);
            case 23:
                return Integer.valueOf(((ml6) obj).a()).compareTo(Integer.valueOf(((ml6) obj2).a()));
            case 24:
                return Integer.valueOf(((ml6) obj2).a()).compareTo(Integer.valueOf(((ml6) obj).a()));
            case 25:
                return qi4.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 26:
                return qi4.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 27:
                c3h c3hVar = (c3h) obj;
                float f = -1.0f;
                if (c3hVar.b.y() == 0.0f && c3hVar.k == null) {
                    y = -1.0f;
                } else {
                    y = c3hVar.b.y();
                }
                Float valueOf = Float.valueOf(y);
                c3h c3hVar2 = (c3h) obj2;
                if (c3hVar2.b.y() != 0.0f || c3hVar2.k != null) {
                    f = c3hVar2.b.y();
                }
                return valueOf.compareTo(Float.valueOf(f));
            case 28:
                return qi4.b(((mo3) obj).k(), ((mo3) obj2).k());
            default:
                return qi4.b(((hki) obj).a, ((hki) obj2).a);
        }
    }
}
