package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class d70 extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ t9k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d70(t9k t9kVar, int i) {
        super(1);
        this.h = i;
        this.i = t9kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AndroidComposeView androidComposeView;
        boolean dispatchTouchEvent;
        int i = this.h;
        t9k t9kVar = this.i;
        switch (i) {
            case 0:
                Owner owner = (Owner) obj;
                if (owner instanceof AndroidComposeView) {
                    androidComposeView = (AndroidComposeView) owner;
                } else {
                    androidComposeView = null;
                }
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(t9kVar);
                    HashMap<LayoutNode, j70> layoutNodeToHolder = androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder();
                    hhj.c(layoutNodeToHolder).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(t9kVar));
                    t9kVar.setImportantForAccessibility(0);
                }
                t9kVar.removeAllViewsInLayout();
                return Unit.INSTANCE;
            case 1:
                t9kVar.q = (Function1) obj;
                return Unit.INSTANCE;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = t9kVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = t9kVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
