package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class kb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ kb0(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                bne bneVar = (bne) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bne.o(0, 0, bneVar, (cne) arrayList.get(i3));
                }
                return Unit.INSTANCE;
            case 1:
                return CreateTicketViewModel.B(arrayList, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
            case 2:
                bne bneVar2 = (bne) obj;
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    z5c z5cVar = (z5c) arrayList.get(i4);
                    List list = z5cVar.b;
                    boolean z = z5cVar.g;
                    if (z5cVar.k == Integer.MIN_VALUE) {
                        nw9.a("position() should be called first");
                    }
                    int size3 = list.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        cne cneVar = (cne) list.get(i5);
                        int i6 = size2;
                        long d = e1a.d((r12[r13 + i2] & 4294967295L) | (z5cVar.i[i5 * 2] << 32), z5cVar.c);
                        if (z) {
                            bne.y(bneVar2, cneVar, d);
                        } else {
                            bne.r(bneVar2, cneVar, d);
                        }
                        i5++;
                        size2 = i6;
                        i2 = 1;
                    }
                    i4++;
                    i2 = 1;
                }
                return Unit.INSTANCE;
            case 3:
                bne bneVar3 = (bne) obj;
                int size4 = arrayList.size();
                for (int i7 = 0; i7 < size4; i7++) {
                    bne.j(0, 0, bneVar3, (cne) arrayList.get(i7));
                }
                return Unit.INSTANCE;
            default:
                ((hw6) obj).getClass();
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((USEventCardViewModel) it.next()).sendInput(USEventCardViewModel.Input.INSTANCE.onVisibilityChanged(true, uuid));
                }
                return new nmj(0, arrayList, uuid);
        }
    }
}
