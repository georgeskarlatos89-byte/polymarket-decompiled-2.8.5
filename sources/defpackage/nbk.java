package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class nbk extends ea1 {
    private static final String TAG = "ViewTarget";
    private static boolean isTagUsedAtLeastOnce = false;
    private static int tagId = 2131427963;
    private View.OnAttachStateChangeListener attachStateListener;
    private boolean isAttachStateListenerAdded;
    private boolean isClearedByUs;
    private final lbk sizeDeterminer;
    protected final View view;

    public nbk(ImageView imageView) {
        zqn.c(imageView, "Argument must not be null");
        this.view = imageView;
        this.sizeDeterminer = new lbk(imageView);
    }

    @Deprecated
    public static void setTagId(int i) {
        if (!isTagUsedAtLeastOnce) {
            tagId = i;
        } else {
            dmk.v("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
    }

    public final void a() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.attachStateListener;
        if (onAttachStateChangeListener != null && !this.isAttachStateListenerAdded) {
            this.view.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.isAttachStateListenerAdded = true;
        }
    }

    public final nbk clearOnDetach() {
        if (this.attachStateListener != null) {
            return this;
        }
        this.attachStateListener = new t20(this, 8);
        a();
        return this;
    }

    @Override // defpackage.voi
    public l1g getRequest() {
        Object tag = this.view.getTag(tagId);
        if (tag != null) {
            if (tag instanceof l1g) {
                return (l1g) tag;
            }
            dmk.v("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.voi
    public void getSize(n9h n9hVar) {
        int i;
        lbk lbkVar = this.sizeDeterminer;
        ArrayList arrayList = lbkVar.b;
        View view = lbkVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = 0;
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int a = lbkVar.a(view.getWidth(), i, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        }
        int a2 = lbkVar.a(view.getHeight(), i2, paddingBottom);
        if ((a <= 0 && a != Integer.MIN_VALUE) || (a2 <= 0 && a2 != Integer.MIN_VALUE)) {
            if (!arrayList.contains(n9hVar)) {
                arrayList.add(n9hVar);
            }
            if (lbkVar.d == null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                u65 u65Var = new u65(lbkVar);
                lbkVar.d = u65Var;
                viewTreeObserver.addOnPreDrawListener(u65Var);
                return;
            }
            return;
        }
        ((h8h) n9hVar).k(a, a2);
    }

    public View getView() {
        return this.view;
    }

    @Override // defpackage.voi
    public void onLoadCleared(Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        lbk lbkVar = this.sizeDeterminer;
        ViewTreeObserver viewTreeObserver = lbkVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(lbkVar.d);
        }
        lbkVar.d = null;
        lbkVar.b.clear();
        if (!this.isClearedByUs && (onAttachStateChangeListener = this.attachStateListener) != null && this.isAttachStateListenerAdded) {
            this.view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.isAttachStateListenerAdded = false;
        }
    }

    public void pauseMyRequest() {
        l1g request = getRequest();
        if (request != null) {
            this.isClearedByUs = true;
            request.clear();
            this.isClearedByUs = false;
        }
    }

    @Override // defpackage.voi
    public void removeCallback(n9h n9hVar) {
        this.sizeDeterminer.b.remove(n9hVar);
    }

    public void resumeMyRequest() {
        l1g request = getRequest();
        if (request != null && request.f()) {
            request.j();
        }
    }

    @Override // defpackage.voi
    public void setRequest(l1g l1gVar) {
        isTagUsedAtLeastOnce = true;
        this.view.setTag(tagId, l1gVar);
    }

    public String toString() {
        return "Target for: " + this.view;
    }

    public final nbk waitForLayout() {
        this.sizeDeterminer.c = true;
        return this;
    }
}
