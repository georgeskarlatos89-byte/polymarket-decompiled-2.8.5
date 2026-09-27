package defpackage;

import com.google.mlkit.common.MlKitException;
import com.polymarket.data.ESquadsTutorialConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class mg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dpc b;

    public /* synthetic */ mg(dpc dpcVar, int i) {
        this.a = i;
        this.b = dpcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        dpc dpcVar = this.b;
        switch (i) {
            case 0:
                nwa nwaVar = (nwa) obj;
                nwaVar.getClass();
                ((hvd) dpcVar).z((int) Float.intBitsToFloat((int) (nwaVar.Z(0L) & 4294967295L)));
                return Unit.INSTANCE;
            case 1:
                ((hvd) dpcVar).z((int) (((n1a) obj).a >> 32));
                return Unit.INSTANCE;
            case 2:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 3:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 4:
                hvd hvdVar = (hvd) dpcVar;
                int y = hvdVar.y() + ((Integer) obj).intValue();
                if (y < 0) {
                    y = 0;
                }
                hvdVar.z(y);
                return Unit.INSTANCE;
            case 5:
                n1a n1aVar = (n1a) obj;
                ((hvd) dpcVar).z((int) (n1aVar.a & 4294967295L));
                epn.a = (int) (n1aVar.a & 4294967295L);
                return Unit.INSTANCE;
            case 6:
                nwa nwaVar2 = (nwa) obj;
                nwaVar2.getClass();
                ((hvd) dpcVar).z((int) Float.intBitsToFloat((int) (nwaVar2.Z(0L) & 4294967295L)));
                return Unit.INSTANCE;
            case 7:
                nwa nwaVar3 = (nwa) obj;
                nwaVar3.getClass();
                ((hvd) dpcVar).z((int) (nwaVar3.h() & 4294967295L));
                return Unit.INSTANCE;
            case 8:
                nwa nwaVar4 = (nwa) obj;
                nwaVar4.getClass();
                ((hvd) dpcVar).z((int) (nwaVar4.h() >> 32));
                return Unit.INSTANCE;
            case 9:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 10:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 11:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 12:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 13:
                ((ESquadsTutorialConfig) obj).getClass();
                return Integer.valueOf(((hvd) dpcVar).y());
            case 14:
                ((hvd) dpcVar).z(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 15:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 16:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case 17:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case MlKitException.UNSUPPORTED /* 18 */:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                ((hvd) dpcVar).z(((Integer) obj).intValue());
                return Unit.INSTANCE;
            default:
                ((hvd) dpcVar).z((int) (((n1a) obj).a & 4294967295L));
                return Unit.INSTANCE;
        }
    }
}
