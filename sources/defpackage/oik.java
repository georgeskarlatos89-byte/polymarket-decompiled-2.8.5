package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class oik {
    public static final qik a;

    static {
        qik nimVar;
        try {
            nimVar = new evf((WebViewProviderFactoryBoundaryInterface) ti1.b(WebViewProviderFactoryBoundaryInterface.class, n6n.d()), 14);
        } catch (ClassNotFoundException unused) {
            nimVar = new nim(8);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            qp7.n(e);
            return;
        }
        a = nimVar;
    }
}
