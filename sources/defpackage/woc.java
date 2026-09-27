package defpackage;

import io.getstream.chat.android.models.Location;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class woc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yoc b;

    public /* synthetic */ woc(yoc yocVar, int i) {
        this.a = i;
        this.b = yocVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        yoc yocVar = this.b;
        switch (i) {
            case 0:
                Location location = (Location) obj;
                location.getClass();
                Date endAt = location.getEndAt();
                if (endAt != null) {
                    z = endAt.after(new Date(((Number) yocVar.b.invoke()).longValue()));
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.areEqual(((Location) obj2).getUserId(), yocVar.a)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
