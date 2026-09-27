package io.radar.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.d55;
import defpackage.p56;
import defpackage.umf;
import io.ably.lib.transport.Defaults;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.model.RadarInAppMessage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0001H\u0002J\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%H\u0002J\u001f\u0010&\u001a\u00020'\"\b\b\u0000\u0010(*\u00020)2\u0006\u0010*\u001a\u0002H(H\u0002¢\u0006\u0002\u0010+JF\u0010,\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000b0.R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lio/radar/sdk/RadarInAppMessageView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDismissListener", "Lkotlin/Function0;", "", "onInAppMessageButtonClicked", "createActionButton", "Landroid/widget/Button;", "button", "Lio/radar/sdk/model/RadarInAppMessage$Button;", "createDismissButton", "Landroid/widget/TextView;", "createHeaderContainer", "createImageContainer", "image", "Landroid/graphics/Bitmap;", "createInAppMessageView", "inAppMessage", "Lio/radar/sdk/model/RadarInAppMessage;", "createMessageView", "body", "Lio/radar/sdk/model/RadarInAppMessage$Body;", "createModalContainer", "Landroid/widget/LinearLayout;", "hasImage", "", "createOverlayBackground", "Landroid/view/View;", "createTitleView", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "Lio/radar/sdk/model/RadarInAppMessage$Title;", "dp", "", "T", "", Defaults.ABLY_PROTOCOL_VERSION_PARAM, "(Ljava/lang/Number;)F", "initialize", "onViewReady", "Lkotlin/Function1;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RadarInAppMessageView extends FrameLayout {
    private static final String DISMISS_BUTTON_BACKGROUND_COLOR = "#808080";
    private static final String DISMISS_BUTTON_TEXT_COLOR = "#FFFFFF";
    private static final String MODAL_BACKGROUND_COLOR = "#FFFFFF";
    private static final String OVERLAY_BACKGROUND_COLOR = "#80000000";
    private Function0<Unit> onDismissListener;
    private Function0<Unit> onInAppMessageButtonClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarInAppMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ void a(View view) {
        createModalContainer$lambda$5$lambda$4(view);
    }

    public static final /* synthetic */ void access$createInAppMessageView(RadarInAppMessageView radarInAppMessageView, RadarInAppMessage radarInAppMessage, Bitmap bitmap) {
        radarInAppMessageView.createInAppMessageView(radarInAppMessage, bitmap);
    }

    public static final /* synthetic */ float access$dp(RadarInAppMessageView radarInAppMessageView, Number number) {
        return radarInAppMessageView.dp(number);
    }

    public static /* synthetic */ void b(RadarInAppMessageView radarInAppMessageView, View view) {
        createDismissButton$lambda$17$lambda$16(radarInAppMessageView, view);
    }

    public static /* synthetic */ void c(RadarInAppMessageView radarInAppMessageView, View view) {
        createActionButton$lambda$13$lambda$12(radarInAppMessageView, view);
    }

    private final Button createActionButton(RadarInAppMessage.Button button) {
        Button button2 = new Button(getContext());
        button2.setText(button.getText());
        button2.setTransformationMethod(null);
        button2.setTextColor(Color.parseColor(button.getColor()));
        button2.setTextSize(2, 22.0f);
        button2.setTypeface(null, 1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 12.0f, button2.getContext().getResources().getDisplayMetrics()));
        gradientDrawable.setColor(Color.parseColor(button.getBackgroundColor()));
        button2.setBackground(gradientDrawable);
        button2.setStateListAnimator(null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dp(310), (int) dp(50));
        layoutParams.setMargins(48, 0, 48, 0);
        button2.setLayoutParams(layoutParams);
        button2.setOnClickListener(new umf(this, 1));
        return button2;
    }

    private static final void createActionButton$lambda$13$lambda$12(RadarInAppMessageView radarInAppMessageView, View view) {
        radarInAppMessageView.getClass();
        Function0<Unit> function0 = radarInAppMessageView.onInAppMessageButtonClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final TextView createDismissButton() {
        TextView textView = new TextView(getContext());
        Drawable g = d55.g(textView.getContext(), R.drawable.close);
        if (g != null) {
            g.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
        } else {
            g = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(g, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(DISMISS_BUTTON_BACKGROUND_COLOR));
        gradientDrawable.setAlpha(127);
        textView.setBackground(gradientDrawable);
        textView.setPadding(18, 12, 18, 12);
        textView.setOnClickListener(new umf(this, 2));
        return textView;
    }

    private static final void createDismissButton$lambda$17$lambda$16(RadarInAppMessageView radarInAppMessageView, View view) {
        radarInAppMessageView.getClass();
        Function0<Unit> function0 = radarInAppMessageView.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final FrameLayout createHeaderContainer() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setPadding(0, 0, 0, 20);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    private final FrameLayout createImageContainer(Bitmap image) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) dp(200));
        layoutParams.setMargins(0, 0, 0, 24);
        frameLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setImageBitmap(image);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(imageView);
        View createDismissButton = createDismissButton();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388661;
        int dp = (int) dp(12);
        layoutParams2.setMargins(dp, dp, dp, dp);
        createDismissButton.setLayoutParams(layoutParams2);
        frameLayout.addView(createDismissButton);
        return frameLayout;
    }

    private final void createInAppMessageView(RadarInAppMessage inAppMessage, Bitmap image) {
        boolean z;
        removeAllViews();
        View createOverlayBackground = createOverlayBackground();
        if (image != null) {
            z = true;
        } else {
            z = false;
        }
        LinearLayout createModalContainer = createModalContainer(z);
        if (image != null) {
            createModalContainer.addView(createImageContainer(image));
        } else {
            FrameLayout createHeaderContainer = createHeaderContainer();
            View createDismissButton = createDismissButton();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            createHeaderContainer.addView(createDismissButton, layoutParams);
            createModalContainer.addView(createHeaderContainer);
        }
        createModalContainer.addView(createTitleView(inAppMessage.getTitle()));
        createModalContainer.addView(createMessageView(inAppMessage.getBody()));
        if (inAppMessage.getButton() != null) {
            createModalContainer.addView(createActionButton(inAppMessage.getButton()));
        }
        addView(createOverlayBackground);
        addView(createModalContainer);
    }

    public static /* synthetic */ void createInAppMessageView$default(RadarInAppMessageView radarInAppMessageView, RadarInAppMessage radarInAppMessage, Bitmap bitmap, int i, Object obj) {
        if ((i & 2) != 0) {
            bitmap = null;
        }
        radarInAppMessageView.createInAppMessageView(radarInAppMessage, bitmap);
    }

    private final TextView createMessageView(RadarInAppMessage.Body body) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(Color.parseColor(body.getColor()));
        textView.setTextSize(2, 17.0f);
        textView.setText(body.getText());
        textView.setGravity(17);
        textView.setLineSpacing(0.0f, 1.2f);
        textView.setPadding(0, 0, 0, 50);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dp(310), -2);
        layoutParams.setMargins(48, 0, 48, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private final LinearLayout createModalContainer(boolean hasImage) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        if (hasImage) {
            linearLayout.setPadding(0, 0, 0, 40);
        } else {
            linearLayout.setPadding(40, 40, 40, 40);
        }
        linearLayout.setGravity(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams((int) dp(350), -2, 17));
        linearLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: io.radar.sdk.RadarInAppMessageView$createModalContainer$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                view.getClass();
                outline.getClass();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), RadarInAppMessageView.access$dp(RadarInAppMessageView.this, 20));
            }
        });
        linearLayout.setClipToOutline(true);
        linearLayout.setOnClickListener(new p56(1));
        return linearLayout;
    }

    public static /* synthetic */ LinearLayout createModalContainer$default(RadarInAppMessageView radarInAppMessageView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return radarInAppMessageView.createModalContainer(z);
    }

    private final View createOverlayBackground() {
        View view = new View(getContext());
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setBackgroundColor(Color.parseColor(OVERLAY_BACKGROUND_COLOR));
        view.setOnClickListener(new umf(this, 0));
        return view;
    }

    private static final void createOverlayBackground$lambda$2$lambda$1(RadarInAppMessageView radarInAppMessageView, View view) {
        radarInAppMessageView.getClass();
        Function0<Unit> function0 = radarInAppMessageView.onDismissListener;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final TextView createTitleView(RadarInAppMessage.Title title) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(Color.parseColor(title.getColor()));
        textView.setTextSize(2, 34.0f);
        textView.setTypeface(null, 1);
        textView.setText(title.getText());
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, 15);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) dp(310), -2);
        layoutParams.setMargins(48, 0, 48, 0);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public static /* synthetic */ void d(RadarInAppMessageView radarInAppMessageView, View view) {
        createOverlayBackground$lambda$2$lambda$1(radarInAppMessageView, view);
    }

    private final <T extends Number> float dp(T v) {
        return v.floatValue() * getContext().getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initialize$default(RadarInAppMessageView radarInAppMessageView, RadarInAppMessage radarInAppMessage, Function0 function0, Function0 function02, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        radarInAppMessageView.initialize(radarInAppMessage, function0, function02, function1);
    }

    public final void initialize(final RadarInAppMessage inAppMessage, Function0<Unit> onDismissListener, Function0<Unit> onInAppMessageButtonClicked, final Function1<? super View, Unit> onViewReady) {
        String str;
        inAppMessage.getClass();
        onViewReady.getClass();
        this.onDismissListener = onDismissListener;
        this.onInAppMessageButtonClicked = onInAppMessageButtonClicked;
        RadarInAppMessage.Image image = inAppMessage.getImage();
        if (image != null) {
            str = image.getUrl();
        } else {
            str = null;
        }
        Radar.loadImage(str, new Function1<Bitmap, Unit>() { // from class: io.radar.sdk.RadarInAppMessageView$initialize$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Bitmap bitmap) {
                RadarInAppMessageView.access$createInAppMessageView(RadarInAppMessageView.this, inAppMessage, bitmap);
                onViewReady.invoke(RadarInAppMessageView.this);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarInAppMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ RadarInAppMessageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadarInAppMessageView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    private static final void createModalContainer$lambda$5$lambda$4(View view) {
    }
}
