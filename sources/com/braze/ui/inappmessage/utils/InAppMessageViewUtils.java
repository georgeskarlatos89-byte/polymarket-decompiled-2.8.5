package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import defpackage.b69;
import defpackage.dmk;
import defpackage.js9;
import defpackage.kqi;
import defpackage.pm1;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b(\u0010\u0003J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010*\u001a\u00020)H\u0007¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\b\u0001\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010#R \u0010/\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010\u0003\u001a\u0004\b/\u00101¨\u00063"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageViewUtils;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "setImage", "(Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V", "Landroid/content/Context;", "context", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, "", "iconColor", "iconBackgroundColor", "Landroid/widget/TextView;", "textView", "setIcon", "(Landroid/content/Context;Ljava/lang/String;IILandroid/widget/TextView;)V", "Landroid/view/View;", "view", "color", "setFrameColor", "(Landroid/view/View;Ljava/lang/Integer;)V", "setTextViewColor", "(Landroid/widget/TextView;I)V", "setViewBackgroundColor", "(Landroid/view/View;I)V", "setViewBackgroundColorFilter", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawableColor", "(Landroid/graphics/drawable/Drawable;I)V", "messageView", "headerView", "resetMessageMarginsIfNecessary", "(Landroid/widget/TextView;Landroid/widget/TextView;)V", "closeInAppMessageOnKeycodeBack", "Lkqi;", "textAlign", "setTextAlignment", "(Landroid/widget/TextView;Lkqi;)V", "setDrawableColorFilter", "", "isApiBelowBaklava", "Z", "()Z", "isApiBelowBaklava$annotations", "android-sdk-ui"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppMessageViewUtils {
    public static final InAppMessageViewUtils INSTANCE = new InAppMessageViewUtils();
    private static final boolean isApiBelowBaklava;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kqi.values().length];
            try {
                iArr[kqi.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kqi.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kqi.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 36) {
            z = true;
        } else {
            z = false;
        }
        isApiBelowBaklava = z;
    }

    private InAppMessageViewUtils() {
    }

    public static /* synthetic */ String a() {
        return closeInAppMessageOnKeycodeBack$lambda$0();
    }

    public static /* synthetic */ String b() {
        return setDrawableColor$lambda$0();
    }

    public static /* synthetic */ String c() {
        return setIcon$lambda$0();
    }

    public static final void closeInAppMessageOnKeycodeBack() {
        b69.h(INSTANCE, null, null, false, new js9(19), 7);
        BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    private static final String closeInAppMessageOnKeycodeBack$lambda$0() {
        return "Back button intercepted by in-app message view, closing in-app message.";
    }

    public static final boolean isApiBelowBaklava() {
        return isApiBelowBaklava;
    }

    public static final void resetMessageMarginsIfNecessary(TextView messageView, TextView headerView) {
        if (headerView == null && messageView != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(messageView.getLayoutParams().width, messageView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            messageView.setLayoutParams(layoutParams);
        }
    }

    public static final void setDrawableColor(Drawable drawable, int color) {
        drawable.getClass();
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() > 0 && (layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                Drawable drawable2 = layerDrawable.getDrawable(0);
                drawable2.getClass();
                setDrawableColor(drawable2, color);
            } else {
                b69.h(INSTANCE, null, null, false, new js9(21), 7);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(color);
        } else {
            INSTANCE.setDrawableColorFilter(drawable, color);
        }
    }

    private static final String setDrawableColor$lambda$0() {
        return "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.";
    }

    private final void setDrawableColorFilter(Drawable drawable, int color) {
        drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
    }

    public static final void setFrameColor(View view, Integer color) {
        view.getClass();
        if (color != null) {
            view.setBackgroundColor(color.intValue());
        }
    }

    public static final void setIcon(Context context, String icon, int iconColor, int iconBackgroundColor, TextView textView) {
        context.getClass();
        textView.getClass();
        if (icon != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(icon);
                setTextViewColor(textView, iconColor);
                if (textView.getBackground() != null) {
                    Drawable background = textView.getBackground();
                    background.getClass();
                    setDrawableColor(background, iconBackgroundColor);
                    return;
                }
                setViewBackgroundColor(textView, iconBackgroundColor);
            } catch (Exception e) {
                b69.h(INSTANCE, pm1.E, e, false, new js9(20), 4);
            }
        }
    }

    private static final String setIcon$lambda$0() {
        return "Caught exception setting icon typeface. Not rendering icon.";
    }

    public static final void setImage(Bitmap bitmap, ImageView imageView) {
        imageView.getClass();
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static final void setTextAlignment(TextView textView, kqi textAlign) {
        int i;
        textView.getClass();
        textAlign.getClass();
        int i2 = WhenMappings.$EnumSwitchMapping$0[textAlign.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 17;
                } else {
                    dmk.a();
                    return;
                }
            } else {
                i = 8388613;
            }
        } else {
            i = 8388611;
        }
        textView.setGravity(i);
    }

    public static final void setTextViewColor(TextView textView, int color) {
        textView.getClass();
        textView.setTextColor(color);
    }

    public static final void setViewBackgroundColor(View view, int color) {
        view.getClass();
        view.setBackgroundColor(color);
    }

    public static final void setViewBackgroundColorFilter(View view, int color) {
        view.getClass();
        InAppMessageViewUtils inAppMessageViewUtils = INSTANCE;
        Drawable background = view.getBackground();
        background.getClass();
        inAppMessageViewUtils.setDrawableColorFilter(background, color);
        view.getBackground().setAlpha(Color.alpha(color));
    }
}
