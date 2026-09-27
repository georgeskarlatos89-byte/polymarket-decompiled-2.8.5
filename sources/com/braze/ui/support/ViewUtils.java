package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.ace;
import defpackage.b69;
import defpackage.bm1;
import defpackage.mmj;
import defpackage.nv6;
import defpackage.pm1;
import defpackage.slk;
import defpackage.tsj;
import defpackage.vlk;
import defpackage.wmd;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!\u001a\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!\u001a\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!\u001a\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroid/view/View;", "", "removeViewFromParent", "(Landroid/view/View;)V", "setFocusableInTouchModeAndRequestFocus", "Landroid/content/Context;", "context", "", "valueInDp", "convertDpToPixels", "(Landroid/content/Context;D)D", "Landroid/app/Activity;", "", "isRunningOnTablet", "(Landroid/app/Activity;)Z", "", "requestedOrientation", "setActivityRequestedOrientation", "(Landroid/app/Activity;I)V", "view", "height", "setHeightOnViewLayoutParams", "(Landroid/view/View;I)V", "isDeviceInNightMode", "(Landroid/content/Context;)Z", "currentScreenOrientation", "Lwmd;", "preferredOrientation", "isCurrentOrientationValid", "(ILwmd;)Z", "Lvlk;", "windowInsets", "getMaxSafeLeftInset", "(Lvlk;)I", "getMaxSafeRightInset", "getMaxSafeTopInset", "getMaxSafeBottomInset", "isDeviceNotInTouchMode", "(Landroid/view/View;)Z", "getStatusBarHeight", "(Landroid/content/Context;)I", "", "TAG", "Ljava/lang/String;", "android-sdk-ui"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ViewUtils {
    private static final String TAG = "Braze v43.1.1 .".concat("ViewUtils");

    public static /* synthetic */ String a() {
        return setFocusableInTouchModeAndRequestFocus$lambda$0();
    }

    public static /* synthetic */ String b() {
        return isCurrentOrientationValid$lambda$0();
    }

    public static /* synthetic */ String c(int i, Activity activity) {
        return setActivityRequestedOrientation$lambda$0(i, activity);
    }

    public static final double convertDpToPixels(Context context, double d) {
        context.getClass();
        return d * context.getResources().getDisplayMetrics().density;
    }

    public static /* synthetic */ String d() {
        return removeViewFromParent$lambda$0();
    }

    public static /* synthetic */ String e(int i, wmd wmdVar) {
        return isCurrentOrientationValid$lambda$2(i, wmdVar);
    }

    public static /* synthetic */ String f(View view, ViewGroup viewGroup) {
        return removeViewFromParent$lambda$1(view, viewGroup);
    }

    public static /* synthetic */ String g() {
        return isCurrentOrientationValid$lambda$1();
    }

    public static final int getMaxSafeBottomInset(vlk vlkVar) {
        int i;
        vlkVar.getClass();
        slk slkVar = vlkVar.a;
        nv6 h = slkVar.h();
        if (h != null) {
            i = h.a.getSafeInsetBottom();
        } else {
            i = 0;
        }
        return Math.max(i, slkVar.i(519).d);
    }

    public static final int getMaxSafeLeftInset(vlk vlkVar) {
        int i;
        vlkVar.getClass();
        slk slkVar = vlkVar.a;
        nv6 h = slkVar.h();
        if (h != null) {
            i = h.a.getSafeInsetLeft();
        } else {
            i = 0;
        }
        return Math.max(i, slkVar.i(519).a);
    }

    public static final int getMaxSafeRightInset(vlk vlkVar) {
        int i;
        vlkVar.getClass();
        slk slkVar = vlkVar.a;
        nv6 h = slkVar.h();
        if (h != null) {
            i = h.a.getSafeInsetRight();
        } else {
            i = 0;
        }
        return Math.max(i, slkVar.i(519).c);
    }

    public static final int getMaxSafeTopInset(vlk vlkVar) {
        int i;
        vlkVar.getClass();
        slk slkVar = vlkVar.a;
        nv6 h = slkVar.h();
        if (h != null) {
            i = h.a.getSafeInsetTop();
        } else {
            i = 0;
        }
        return Math.max(i, slkVar.i(519).b);
    }

    public static final int getStatusBarHeight(Context context) {
        context.getClass();
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static /* synthetic */ String h() {
        return removeViewFromParent$lambda$2();
    }

    public static final boolean isCurrentOrientationValid(int i, wmd wmdVar) {
        wmdVar.getClass();
        if (i == 2 && wmdVar == wmd.LANDSCAPE) {
            b69.o(TAG, pm1.D, null, false, new tsj(24), 12);
            return true;
        }
        if (i == 1 && wmdVar == wmd.PORTRAIT) {
            b69.o(TAG, pm1.D, null, false, new tsj(25), 12);
            return true;
        }
        b69.o(TAG, pm1.D, null, false, new bm1(i, wmdVar, 15), 12);
        return false;
    }

    private static final String isCurrentOrientationValid$lambda$0() {
        return "Current and preferred orientation are landscape.";
    }

    private static final String isCurrentOrientationValid$lambda$1() {
        return "Current and preferred orientation are portrait.";
    }

    private static final String isCurrentOrientationValid$lambda$2(int i, wmd wmdVar) {
        return "Current orientation " + i + " and preferred orientation " + wmdVar + " don't match";
    }

    public static final boolean isDeviceInNightMode(Context context) {
        context.getClass();
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        view.getClass();
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        activity.getClass();
        if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return true;
        }
        return false;
    }

    public static final void removeViewFromParent(View view) {
        ViewParent viewParent;
        if (view == null) {
            try {
                b69.o(TAG, pm1.D, null, false, new tsj(22), 12);
            } catch (Exception e) {
                b69.o(TAG, pm1.E, e, false, new tsj(23), 8);
                return;
            }
        }
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            b69.o(TAG, pm1.D, null, false, new mmj(18, view, viewGroup), 12);
        }
    }

    private static final String removeViewFromParent$lambda$0() {
        return "View passed in is null. Not removing from parent.";
    }

    private static final String removeViewFromParent$lambda$1(View view, ViewGroup viewGroup) {
        return "Removed view: " + view + "\nfrom parent: " + viewGroup;
    }

    private static final String removeViewFromParent$lambda$2() {
        return "Caught exception while removing view from parent.";
    }

    public static final void setActivityRequestedOrientation(Activity activity, int i) {
        activity.getClass();
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            b69.o(TAG, pm1.E, e, false, new bm1(i, activity, 14), 8);
        }
    }

    private static final String setActivityRequestedOrientation$lambda$0(int i, Activity activity) {
        StringBuilder o = ace.o(i, "Failed to set requested orientation ", " for activity class: ");
        o.append(activity.getLocalClassName());
        return o.toString();
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        view.getClass();
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            b69.o(TAG, pm1.E, e, false, new tsj(21), 8);
        }
    }

    private static final String setFocusableInTouchModeAndRequestFocus$lambda$0() {
        return "Caught exception while setting view to focusable in touch mode and requesting focus.";
    }

    public static final void setHeightOnViewLayoutParams(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
