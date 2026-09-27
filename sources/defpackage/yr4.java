package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.mlkit.common.MlKitException;
import io.sentry.android.core.m0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class yr4 extends Lambda implements Function0 {
    public final /* synthetic */ int h;
    public static final yr4 i = new yr4(0, 0);
    public static final yr4 j = new yr4(0, 1);
    public static final yr4 k = new yr4(0, 2);
    public static final yr4 l = new yr4(0, 3);
    public static final yr4 m = new yr4(0, 4);
    public static final yr4 n = new yr4(0, 5);
    public static final yr4 o = new yr4(0, 6);
    public static final yr4 p = new yr4(0, 7);
    public static final yr4 q = new yr4(0, 8);
    public static final yr4 r = new yr4(0, 9);
    public static final yr4 s = new yr4(0, 10);
    public static final yr4 t = new yr4(0, 11);
    public static final yr4 u = new yr4(0, 12);
    public static final yr4 v = new yr4(0, 13);
    public static final yr4 w = new yr4(0, 14);
    public static final yr4 x = new yr4(0, 15);
    public static final yr4 y = new yr4(0, 16);
    public static final yr4 z = new yr4(0, 17);
    public static final yr4 A = new yr4(0, 18);
    public static final yr4 B = new yr4(0, 19);
    public static final yr4 C = new yr4(0, 20);
    public static final yr4 D = new yr4(0, 21);
    public static final yr4 E = new yr4(0, 22);
    public static final yr4 F = new yr4(0, 23);
    public static final yr4 G = new yr4(0, 24);
    public static final yr4 H = new yr4(0, 25);
    public static final yr4 I = new yr4(0, 26);
    public static final yr4 J = new yr4(0, 27);
    public static final yr4 K = new yr4(0, 28);
    public static final yr4 L = new yr4(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr4(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Field field;
        switch (this.h) {
            case 0:
                as4.b("LocalFontFamilyResolver");
                throw null;
            case 1:
                as4.b("LocalFontLoader");
                throw null;
            case 2:
                as4.b("LocalGraphicsContext");
                throw null;
            case 3:
                as4.b("LocalHapticFeedback");
                throw null;
            case 4:
                as4.b("LocalInputManager");
                throw null;
            case 5:
                as4.b("LocalLayoutDirection");
                throw null;
            case 6:
                return null;
            case 7:
                as4.b("LocalProvidableLocaleList");
                throw null;
            case 8:
                return Boolean.FALSE;
            case 9:
            case 10:
                return null;
            case 11:
                as4.b("LocalTextToolbar");
                throw null;
            case 12:
                as4.b("LocalUriHandler");
                throw null;
            case 13:
                as4.b("LocalViewConfiguration");
                throw null;
            case 14:
                as4.b("LocalWindowInfo");
                throw null;
            case 15:
                return new wo();
            case 16:
                return new mt4();
            case 17:
                fag fagVar = new fag();
                Lazy lazy = emk.a;
                b6c b6cVar = new b6c(fagVar, 8);
                try {
                    Object value = emk.b.getValue();
                    if (value != null && (field = (Field) emk.c.getValue()) != null) {
                        Object obj = field.get(value);
                        if (obj != null) {
                            field.set(value, b6cVar.invoke((ArrayList) obj));
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                        }
                    }
                } catch (Throwable th) {
                    m0.r("WindowManagerSpy", th);
                }
                return fagVar;
            case MlKitException.UNSUPPORTED /* 18 */:
                return Boolean.TRUE;
            case zh4.REMOTE_EXCEPTION /* 19 */:
                return Boolean.FALSE;
            case 20:
                return Boolean.FALSE;
            case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new LayoutNode(3);
            case 22:
                return new LayoutNode(2);
            case 23:
                return new Object();
            case 24:
                return tcn.a();
            case 25:
                return null;
            case 26:
                return odn.b(odn.f(600, 200, null, 4), tzf.Reverse, 0L, 4);
            case 27:
                return odn.b(odn.f(1700, 200, null, 4), tzf.Restart, 0L, 4);
            case 28:
                return null;
            default:
                return Unit.INSTANCE;
        }
    }
}
