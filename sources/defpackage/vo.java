package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.common.MlKitException;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class vo extends Lambda implements Function0 {
    public final /* synthetic */ int h;
    public static final vo i = new vo(0, 0);
    public static final vo j = new vo(0, 1);
    public static final vo k = new vo(0, 2);
    public static final vo l = new vo(0, 3);
    public static final vo m = new vo(0, 4);
    public static final vo n = new vo(0, 5);
    public static final vo o = new vo(0, 6);
    public static final vo p = new vo(0, 7);
    public static final vo q = new vo(0, 8);
    public static final vo r = new vo(0, 9);
    public static final vo s = new vo(0, 10);
    public static final vo t = new vo(0, 11);
    public static final vo u = new vo(0, 12);
    public static final vo v = new vo(0, 13);
    public static final vo w = new vo(0, 14);
    public static final vo x = new vo(0, 15);
    public static final vo y = new vo(0, 16);
    public static final vo z = new vo(0, 17);
    public static final vo A = new vo(0, 18);
    public static final vo B = new vo(0, 19);
    public static final vo C = new vo(0, 20);
    public static final vo D = new vo(0, 21);
    public static final vo E = new vo(0, 22);
    public static final vo F = new vo(0, 23);
    public static final vo G = new vo(0, 24);
    public static final vo H = new vo(0, 25);
    public static final vo I = new vo(0, 26);
    public static final vo J = new vo(0, 27);
    public static final vo K = new vo(0, 28);
    public static final vo L = new vo(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.h) {
            case 0:
                return new wo();
            case 1:
                return new kp();
            case 2:
                return new rp();
            case 3:
                AndroidCompositionLocals_androidKt.a("LocalConfiguration");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.a("LocalContext");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
                throw null;
            case 6:
                AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
                throw null;
            case 7:
                AndroidCompositionLocals_androidKt.a("LocalView");
                throw null;
            case 8:
                return UUID.randomUUID();
            case 9:
                return new krb();
            case 10:
                return Boolean.FALSE;
            case 11:
                return "DEFAULT_TEST_TAG";
            case 12:
                return UUID.randomUUID();
            case 13:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    mv6 mv6Var = mv6.a;
                    choreographer = (Choreographer) whn.b(qyb.b, new p60(2, 0, null));
                }
                r60 r60Var = new r60(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return r60Var.plus(r60Var.k);
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return new Object();
            case MlKitException.UNSUPPORTED /* 18 */:
                return null;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return Boolean.FALSE;
            case 20:
                return new LayoutNode(2);
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
                return null;
            case 23:
                as4.b("LocalAutofillManager");
                throw null;
            case 24:
                as4.b("LocalAutofillTree");
                throw null;
            case 25:
                as4.b("LocalClipboard");
                throw null;
            case 26:
                as4.b("LocalClipboardManager");
                throw null;
            case 27:
                return Boolean.TRUE;
            case 28:
                as4.b("LocalDensity");
                throw null;
            default:
                as4.b("LocalFocusManager");
                throw null;
        }
    }
}
