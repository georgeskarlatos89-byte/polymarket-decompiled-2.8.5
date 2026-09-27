package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class qd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Flow[] b;

    public /* synthetic */ qd(Flow[] flowArr, int i) {
        this.a = i;
        this.b = flowArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new nz7[this.b.length];
            case 1:
                return new List[this.b.length];
            case 2:
                return new List[this.b.length];
            case 3:
                return new List[this.b.length];
            case 4:
                return new nz7[this.b.length];
            case 5:
                return new nz7[this.b.length];
            case 6:
                return new Pair[this.b.length];
            case 7:
                return new List[this.b.length];
            case 8:
                return new List[this.b.length];
            case 9:
                return new String[this.b.length];
            case 10:
                return new Boolean[5];
            case 11:
                return new Boolean[7];
            case 12:
                return new nz7[this.b.length];
            case 13:
                return new List[this.b.length];
            case 14:
                return new nz7[this.b.length];
            case 15:
                return new List[this.b.length];
            case 16:
                return new List[this.b.length];
            case 17:
                return new Object[this.b.length];
            case MlKitException.UNSUPPORTED /* 18 */:
                return new Object[this.b.length];
            default:
                return new Object[this.b.length];
        }
    }
}
