package io.intercom.android.sdk.blocks.views;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import defpackage.aci;
import defpackage.cp9;
import defpackage.d55;
import defpackage.e8k;
import defpackage.fp9;
import defpackage.ij7;
import defpackage.ip9;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.StyleType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.AccessibilityUtils;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.IntercomCoilKt;
import io.intercom.android.sdk.utilities.commons.ScreenUtils;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class VideoPreviewView extends RelativeLayout {
    private static final int PLAY_ARROW_OFFSET_DP = 3;
    private static final int PLAY_BUTTON_DIAMETER_DP = 48;
    private final ProgressBar loadingSpinner;
    private final ImageView playButton;
    private final ImageView thumbnailImageView;

    public VideoPreviewView(Context context, Provider<AppConfig> provider, StyleType styleType) {
        super(context);
        BlockUtils.createLayoutParams(this, -2, -2);
        BlockUtils.setDefaultMarginBottom(this);
        ImageView videoImageView = getVideoImageView(context);
        this.thumbnailImageView = videoImageView;
        ImageView playButtonView = getPlayButtonView(context);
        this.playButton = playButtonView;
        ProgressBar loadingSpinner = getLoadingSpinner();
        this.loadingSpinner = loadingSpinner;
        addView(videoImageView);
        addView(playButtonView);
        addView(loadingSpinner);
        int primaryColor = provider.get().getPrimaryColor();
        primaryColor = styleType == StyleType.POST ? ColorUtils.lightenColor(primaryColor) : primaryColor;
        if (ColorUtils.isColorLight(primaryColor)) {
            playButtonView.setColorFilter(d55.d(context, R.color.intercom_accessibility_black), PorterDuff.Mode.SRC_ATOP);
        } else {
            playButtonView.setColorFilter(primaryColor, PorterDuff.Mode.SRC_ATOP);
        }
        AccessibilityUtils accessibilityUtils = AccessibilityUtils.INSTANCE;
        accessibilityUtils.removeClickAbilityAnnouncement(this);
        accessibilityUtils.addClickAbilityAnnouncement(playButtonView);
    }

    public static /* synthetic */ void a(VideoPreviewView videoPreviewView) {
        videoPreviewView.lambda$showFailedImage$0();
    }

    public static /* synthetic */ ProgressBar access$000(VideoPreviewView videoPreviewView) {
        return videoPreviewView.loadingSpinner;
    }

    public static /* synthetic */ ImageView access$100(VideoPreviewView videoPreviewView) {
        return videoPreviewView.thumbnailImageView;
    }

    public static /* synthetic */ void access$200(VideoPreviewView videoPreviewView) {
        videoPreviewView.updateThumbnailAspectRatio();
    }

    public static /* synthetic */ ImageView access$300(VideoPreviewView videoPreviewView) {
        return videoPreviewView.playButton;
    }

    private ProgressBar getLoadingSpinner() {
        return (ProgressBar) View.inflate(getContext(), R.layout.intercom_progress_bar, null).findViewById(R.id.progressBar);
    }

    private ImageView getPlayButtonView(Context context) {
        int dpToPx = ScreenUtils.dpToPx(48.0f, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams.addRule(13);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.intercom_play_arrow);
        imageView.setPadding(ScreenUtils.dpToPx(3.0f, context), 0, 0, 0);
        imageView.setBackgroundResource(R.drawable.intercom_solid_circle);
        imageView.setVisibility(8);
        imageView.setId(R.id.intercom_video_thumbnail_play_button);
        AccessibilityUtils.INSTANCE.addClickAbilityAnnouncement(imageView);
        return imageView;
    }

    private ImageView getVideoImageView(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setId(R.id.intercom_video_thumbnail);
        return imageView;
    }

    private /* synthetic */ void lambda$showFailedImage$0() {
        BackgroundUtils.setBackground(this.thumbnailImageView, d55.g(getContext(), R.drawable.intercom_video_thumbnail_fallback));
    }

    private void updateThumbnailAspectRatio() {
        this.thumbnailImageView.getLayoutParams().height = (this.thumbnailImageView.getWidth() * 3) / 4;
    }

    public void displayThumbnail(String str) {
        this.loadingSpinner.setVisibility(0);
        this.thumbnailImageView.setVisibility(4);
        cp9 cp9Var = new cp9(getContext());
        cp9Var.c = str;
        cp9Var.q = Integer.valueOf(R.drawable.intercom_video_thumbnail_fallback);
        cp9Var.r = null;
        cp9Var.c(R.drawable.intercom_video_thumbnail_fallback);
        cp9Var.b();
        cp9Var.f(this.thumbnailImageView);
        cp9Var.e = new fp9() { // from class: io.intercom.android.sdk.blocks.views.VideoPreviewView.1
            @Override // defpackage.fp9
            public void onError(ip9 ip9Var, ij7 ij7Var) {
                VideoPreviewView.access$000(VideoPreviewView.this).setVisibility(8);
                VideoPreviewView.access$100(VideoPreviewView.this).setVisibility(0);
                VideoPreviewView.access$200(VideoPreviewView.this);
                VideoPreviewView.access$300(VideoPreviewView.this).setVisibility(8);
            }

            @Override // defpackage.fp9
            public void onSuccess(ip9 ip9Var, aci aciVar) {
                VideoPreviewView.access$000(VideoPreviewView.this).setVisibility(8);
                VideoPreviewView.access$100(VideoPreviewView.this).setVisibility(0);
                VideoPreviewView.access$200(VideoPreviewView.this);
                VideoPreviewView.access$100(VideoPreviewView.this).setColorFilter(d55.d(VideoPreviewView.access$100(VideoPreviewView.this).getContext(), R.color.intercom_semi_transparent), PorterDuff.Mode.DARKEN);
                VideoPreviewView.access$300(VideoPreviewView.this).setVisibility(0);
            }

            @Override // defpackage.fp9
            public void onCancel(ip9 ip9Var) {
            }

            @Override // defpackage.fp9
            public void onStart(ip9 ip9Var) {
            }
        };
        IntercomCoilKt.loadIntercomImage(getContext(), cp9Var.a());
    }

    public ImageView getThumbnailImageView() {
        return this.thumbnailImageView;
    }

    public void showFailedImage() {
        this.thumbnailImageView.post(new e8k(this, 1));
    }
}
