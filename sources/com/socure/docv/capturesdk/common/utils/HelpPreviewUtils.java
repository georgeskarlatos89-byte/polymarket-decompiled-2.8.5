package com.socure.docv.capturesdk.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.polymarket.android.R;
import com.socure.docv.capturesdk.common.network.model.stepup.NewLabels;
import com.socure.docv.capturesdk.common.view.model.f;
import com.socure.docv.capturesdk.common.view.model.g;
import com.socure.docv.capturesdk.common.view.model.h;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.databinding.e;
import com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView;
import com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView;
import com.socure.docv.capturesdk.models.i;
import com.socure.docv.capturesdk.models.m;
import com.socure.docv.capturesdk.models.w0;
import com.socure.docv.capturesdk.models.x;
import defpackage.a7h;
import defpackage.dmk;
import defpackage.fc4;
import defpackage.k84;
import defpackage.la1;
import defpackage.ma1;
import defpackage.mc3;
import defpackage.rbh;
import defpackage.zah;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010!\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010'\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010/\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b-\u0010.J7\u00109\u001a\u00020,2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u0002002\b\u00104\u001a\u0004\u0018\u0001032\f\u00106\u001a\b\u0012\u0004\u0012\u00020,05H\u0000¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b:\u0010\u0011J!\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120=2\u0006\u0010<\u001a\u00020\u000b¢\u0006\u0004\b>\u0010?J\u001d\u0010C\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u001d\u0010C\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010EJ\u001d\u0010F\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010DJ\u001d\u0010F\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010EJ\u001d\u0010G\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bG\u0010DJ\u001d\u0010G\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00122\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bG\u0010EJ\u001d\u0010J\u001a\u00020I2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010H\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/HelpPreviewUtils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "scanType", "", "isCardVertical", "enablePassportSignatureCapture", "", "getDimensionRatio", "(Landroid/content/Context;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;ZZ)Ljava/lang/String;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "newLabels", "getPreviewConfirmationText", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;)Ljava/lang/String;", "", "getHelpBannerImage", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;)I", "", "getHelpInstruction", "(Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;)Ljava/util/List;", "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "output", "Lcom/socure/docv/capturesdk/models/w0;", "startSessionModel", "Lcom/socure/docv/capturesdk/common/utils/PreviewDataInputGenerator;", "inputGenerator", "Lcom/socure/docv/capturesdk/common/view/model/g;", "getPreviewUiData$capturesdk_productionRelease", "(Landroid/content/Context;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;Lcom/socure/docv/capturesdk/core/processor/model/Output;Lcom/socure/docv/capturesdk/models/w0;Lcom/socure/docv/capturesdk/common/utils/PreviewDataInputGenerator;)Lcom/socure/docv/capturesdk/common/view/model/g;", "getPreviewUiData", "Lcom/socure/docv/capturesdk/common/utils/GetHelpViewData;", "getHelpViewData", "Lcom/socure/docv/capturesdk/common/view/model/f;", "getHelpViewUiData$capturesdk_productionRelease", "(Lcom/socure/docv/capturesdk/models/w0;Lcom/socure/docv/capturesdk/common/utils/GetHelpViewData;)Lcom/socure/docv/capturesdk/common/view/model/f;", "getHelpViewUiData", "Landroid/view/View;", "view", "Lcom/socure/docv/capturesdk/databinding/e;", "binding", "", "setVisibilityFocus$capturesdk_productionRelease", "(Landroid/view/View;Lcom/socure/docv/capturesdk/databinding/e;)V", "setVisibilityFocus", "Landroid/widget/ImageView;", "ivDbgPreviewScan", "icSaveImages", "Landroid/graphics/Bitmap;", "debugBitmap", "Lkotlin/Function0;", "saveDebugImage", "showPreviewDbgImg$capturesdk_productionRelease", "(Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function0;)V", "showPreviewDbgImg", "getScannerHelpText$capturesdk_productionRelease", "getScannerHelpText", "primaryColor", "Lkotlin/Pair;", "getPreviewProgressButtonColors", "(Ljava/lang/String;)Lkotlin/Pair;", "color", "", "ratio", "getLightColor", "(Ljava/lang/String;F)I", "(IF)I", "getDarkColor", "getGrayishColor", "borderColor", "Landroid/graphics/drawable/Drawable;", "getSecondaryButtonDrawable", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HelpPreviewUtils {
    public static final int $stable = 0;
    public static final HelpPreviewUtils INSTANCE = new HelpPreviewUtils();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScanType.SELFIE_AUTO_CAPTURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private HelpPreviewUtils() {
    }

    public static /* synthetic */ void a(Function0 function0, View view) {
        showPreviewDbgImg$lambda$2$lambda$1(function0, view);
    }

    public static /* synthetic */ void b(Function0 function0, View view) {
        showPreviewDbgImg$lambda$2(function0, view);
    }

    private final String getDimensionRatio(Context context, ScanType scanType, boolean isCardVertical, boolean enablePassportSignatureCapture) {
        int i;
        String string;
        int i2 = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4 && i2 != 5) {
                    dmk.a();
                    return null;
                }
                string = context.getResources().getString(R.string.socure_selfie_preview_ratio);
            } else if (enablePassportSignatureCapture) {
                string = context.getResources().getString(R.string.socure_passport_aspect_ratio_preview_bg_with_signature);
            } else {
                string = context.getResources().getString(R.string.socure_passport_aspect_ratio_preview_bg);
            }
        } else {
            Resources resources = context.getResources();
            if (isCardVertical) {
                i = R.string.socure_vertical_license_aspect_ratio_bg;
            } else {
                i = R.string.socure_license_aspect_ratio_bg;
            }
            string = resources.getString(i);
        }
        string.getClass();
        return string;
    }

    public static /* synthetic */ String getDimensionRatio$default(HelpPreviewUtils helpPreviewUtils, Context context, ScanType scanType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return helpPreviewUtils.getDimensionRatio(context, scanType, z, z2);
    }

    private final String getPreviewConfirmationText(ScanType scanType, NewLabels newLabels) {
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        dmk.a();
                        return null;
                    }
                    return newLabels.isYourFaceInFrame();
                }
                return newLabels.isAllInfoVisiblePassport();
            }
            return newLabels.isAllInfoVisibleBarcode();
        }
        return newLabels.isAllInfoVisible();
    }

    private static final void showPreviewDbgImg$lambda$2(Function0 function0, View view) {
        ViewGroup viewGroup;
        int i;
        ma1 ma1Var;
        int i2;
        io.sentry.config.a.O("SDLT_HELP_PREVIEW_UTILS", "Debug image saver clicked");
        int[] iArr = zah.D;
        View view2 = view;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view2 instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view2;
                break;
            }
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    viewGroup = (ViewGroup) view2;
                    break;
                }
                viewGroup2 = (ViewGroup) view2;
            }
            if (view2 != null) {
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                } else {
                    view2 = null;
                }
            }
            if (view2 == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(zah.D);
            boolean z = false;
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1 && resourceId2 != -1) {
                i = R.layout.mtrl_layout_snackbar_include;
            } else {
                i = R.layout.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i, viewGroup, false);
            zah zahVar = new zah(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) zahVar.i.getChildAt(0)).getMessageView().setText("Export debug images to disk?");
            d dVar = new d(function0, 0);
            Button actionView = ((SnackbarContentLayout) zahVar.i.getChildAt(0)).getActionView();
            if (!TextUtils.isEmpty("YES")) {
                zahVar.C = true;
                actionView.setVisibility(0);
                actionView.setText("YES");
                actionView.setOnClickListener(new mc3(3, zahVar, dVar));
            } else {
                actionView.setVisibility(8);
                actionView.setOnClickListener(null);
                zahVar.C = false;
            }
            ((SnackbarContentLayout) zahVar.i.getChildAt(0)).getActionView().setTextColor(-16711936);
            ma1 ma1Var2 = zahVar.k;
            if (ma1Var2 != null) {
                ma1Var2.a();
            }
            if (view == null) {
                ma1Var = null;
            } else {
                ma1Var = new ma1(zahVar, view);
                if (view.isAttachedToWindow()) {
                    view.getViewTreeObserver().addOnGlobalLayoutListener(ma1Var);
                }
                view.addOnAttachStateChangeListener(ma1Var);
            }
            zahVar.k = ma1Var;
            a7h g = a7h.g();
            if (zahVar.C) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            int recommendedTimeoutMillis = zahVar.B.getRecommendedTimeoutMillis(0, i2 | 3);
            la1 la1Var = zahVar.u;
            synchronized (g.a) {
                try {
                    if (g.m(la1Var)) {
                        rbh rbhVar = (rbh) g.c;
                        rbhVar.b = recommendedTimeoutMillis;
                        ((Handler) g.b).removeCallbacksAndMessages(rbhVar);
                        g.z((rbh) g.c);
                        return;
                    }
                    rbh rbhVar2 = (rbh) g.d;
                    if (rbhVar2 != null && rbhVar2.a.get() == la1Var) {
                        z = true;
                    }
                    if (z) {
                        ((rbh) g.d).b = recommendedTimeoutMillis;
                    } else {
                        g.d = new rbh(recommendedTimeoutMillis, la1Var);
                    }
                    rbh rbhVar3 = (rbh) g.c;
                    if (rbhVar3 != null && g.b(rbhVar3, 4)) {
                        return;
                    }
                    g.c = null;
                    g.A();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        dmk.v("No suitable parent found from the given view. Please provide a valid view.");
    }

    private static final void showPreviewDbgImg$lambda$2$lambda$1(Function0 function0, View view) {
        function0.invoke();
    }

    public final int getDarkColor(String color, float ratio) {
        color.getClass();
        return fc4.c(Color.parseColor(color), ratio, -16777216);
    }

    public final int getGrayishColor(String color, float ratio) {
        color.getClass();
        return fc4.c(Color.parseColor(color), ratio, -7829368);
    }

    public final int getHelpBannerImage(ScanType scanType) {
        scanType.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return R.drawable.socure_help_selfie_auto;
                        }
                        dmk.a();
                        return 0;
                    }
                    return R.drawable.socure_help_selfie;
                }
                return R.drawable.socure_help_passport;
            }
            return R.drawable.socure_help_lic_back;
        }
        return R.drawable.socure_help_lic_front;
    }

    public final List<String> getHelpInstruction(ScanType scanType, NewLabels newLabels) {
        scanType.getClass();
        newLabels.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        dmk.a();
                        return null;
                    }
                    return CollectionsKt.listOf(newLabels.getAlignFaceFrame(), newLabels.getHoldDevice(), newLabels.getLookDirectly());
                }
                return CollectionsKt.listOf(newLabels.getOpenPassport(), newLabels.getHoldPhoneOverPassport(), newLabels.getFocusCameraPassport());
            }
            return CollectionsKt.listOf(newLabels.getFlipYourId(), newLabels.getHoldPhoneOverId(), newLabels.getFocusCameraId());
        }
        return CollectionsKt.listOf(newLabels.getPlaceIdFlat(), newLabels.getHoldPhoneOverId(), newLabels.getFocusCameraId());
    }

    public final f getHelpViewUiData$capturesdk_productionRelease(w0 startSessionModel, GetHelpViewData getHelpViewData) {
        startSessionModel.getClass();
        getHelpViewData.getClass();
        String helpTitleText = getHelpViewData.getHelpTitleText();
        x xVar = startSessionModel.c;
        h hVar = new h(helpTitleText, xVar.b.a.a.a);
        int helpBannerImage = getHelpViewData.getHelpBannerImage();
        List<String> helpInstruction = getHelpViewData.getHelpInstruction();
        String str = xVar.b.a.a.a;
        String backToScanning = getHelpViewData.getBackToScanning();
        i iVar = xVar.b.a.a.e.a;
        return new f(hVar, helpBannerImage, helpInstruction, str, new com.socure.docv.capturesdk.common.view.model.b(backToScanning, iVar.a, iVar.f, iVar.b));
    }

    public final int getLightColor(String color, float ratio) {
        color.getClass();
        return fc4.c(Color.parseColor(color), ratio, -1);
    }

    public final Pair<Integer, Integer> getPreviewProgressButtonColors(String primaryColor) {
        primaryColor.getClass();
        return new Pair<>(Integer.valueOf(getLightColor(primaryColor, 0.8f)), Integer.valueOf(getLightColor(primaryColor, 0.6f)));
    }

    public final g getPreviewUiData$capturesdk_productionRelease(Context context, ScanType scanType, Output output, w0 startSessionModel, PreviewDataInputGenerator inputGenerator) {
        boolean z;
        context.getClass();
        scanType.getClass();
        output.getClass();
        startSessionModel.getClass();
        inputGenerator.getClass();
        if (output.getFinalBitmap().getHeight() > output.getFinalBitmap().getWidth()) {
            z = true;
        } else {
            z = false;
        }
        x xVar = startSessionModel.c;
        String dimensionRatio = getDimensionRatio(context, scanType, z, xVar.i.k);
        String confirmationTitleText = inputGenerator.getConfirmationTitleText();
        m mVar = xVar.b;
        m mVar2 = xVar.b;
        h hVar = new h(confirmationTitleText, mVar.a.a.a);
        String previewConfirmationText = inputGenerator.getPreviewConfirmationText();
        h hVar2 = new h(inputGenerator.getSubmitImageForValidation(), mVar2.a.a.a);
        h hVar3 = new h(previewConfirmationText, mVar2.a.a.a);
        String contBtnText = inputGenerator.getContBtnText();
        i iVar = mVar2.a.a.e.a;
        com.socure.docv.capturesdk.common.view.model.b bVar = new com.socure.docv.capturesdk.common.view.model.b(contBtnText, iVar.a, null, iVar.b);
        String retakeBtnText = inputGenerator.getRetakeBtnText();
        i iVar2 = mVar2.a.a.e.b;
        return new g(dimensionRatio, hVar, hVar2, hVar3, output.getFinalBitmap(), bVar, new com.socure.docv.capturesdk.common.view.model.b(retakeBtnText, iVar2.a, iVar2.f, iVar2.b), output.getDebugBitmap());
    }

    public final String getScannerHelpText$capturesdk_productionRelease(ScanType scanType, NewLabels newLabels) {
        scanType.getClass();
        newLabels.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        dmk.a();
                        return null;
                    }
                    return newLabels.getMovePhoneFront();
                }
                return newLabels.getPlaceFlatAndHoldPassport();
            }
            return newLabels.getFlipIdBarcode();
        }
        return newLabels.getPlaceFlatAndHoldId();
    }

    public final Drawable getSecondaryButtonDrawable(Context context, String borderColor) {
        context.getClass();
        borderColor.getClass();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke((int) context.getResources().getDimension(R.dimen.stroke_button_stroke_width_socure), Color.parseColor(borderColor));
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.stroke_button_corner_radius_socure));
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    public final void setVisibilityFocus$capturesdk_productionRelease(View view, e binding) {
        view.getClass();
        binding.getClass();
        com.socure.docv.capturesdk.databinding.a aVar = binding.d;
        if (view instanceof PreviewView) {
            ((HelpView) aVar.f).setVisibility(8);
            PreviewView previewView = (PreviewView) aVar.g;
            previewView.q = System.currentTimeMillis();
            previewView.setVisibility(0);
            return;
        }
        if (view instanceof HelpView) {
            PreviewView previewView2 = (PreviewView) aVar.g;
            previewView2.q = -1L;
            previewView2.setVisibility(8);
            ((HelpView) aVar.f).setVisibility(0);
        }
    }

    public final void showPreviewDbgImg$capturesdk_productionRelease(ImageView ivDbgPreviewScan, ImageView icSaveImages, Bitmap debugBitmap, Function0<Unit> saveDebugImage) {
        Boolean bool;
        ivDbgPreviewScan.getClass();
        icSaveImages.getClass();
        saveDebugImage.getClass();
        Utils utils = Utils.INSTANCE;
        boolean z = true;
        if (utils.showDebugImage$capturesdk_productionRelease() && debugBitmap != null && !debugBitmap.isRecycled()) {
            io.sentry.config.a.O("SDLT_HELP_PREVIEW_UTILS", "showing DebugImage");
            icSaveImages.setOnClickListener(new d(saveDebugImage, 1));
            ivDbgPreviewScan.setVisibility(0);
            icSaveImages.setVisibility(0);
            ivDbgPreviewScan.setImageBitmap(debugBitmap);
            return;
        }
        boolean showDebugImage$capturesdk_productionRelease = utils.showDebugImage$capturesdk_productionRelease();
        if (debugBitmap != null) {
            z = false;
        }
        if (debugBitmap != null) {
            bool = Boolean.valueOf(debugBitmap.isRecycled());
        } else {
            bool = null;
        }
        StringBuilder h = k84.h("showDebugImage: ", " | debug img null: ", " | recycled: ", showDebugImage$capturesdk_productionRelease, z);
        h.append(bool);
        io.sentry.config.a.O("SDLT_HELP_PREVIEW_UTILS", h.toString());
        ivDbgPreviewScan.setVisibility(8);
        icSaveImages.setVisibility(8);
    }

    public final int getLightColor(int color, float ratio) {
        return fc4.c(color, ratio, -1);
    }

    public final int getDarkColor(int color, float ratio) {
        return fc4.c(color, ratio, -16777216);
    }

    public final int getGrayishColor(int color, float ratio) {
        return fc4.c(color, ratio, -7829368);
    }
}
