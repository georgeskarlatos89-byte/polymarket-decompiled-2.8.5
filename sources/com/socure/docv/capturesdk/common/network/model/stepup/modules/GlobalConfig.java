package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.ace;
import defpackage.hdi;
import defpackage.k84;
import defpackage.mda;
import defpackage.woa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bi\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%\u0012\b\u00100\u001a\u0004\u0018\u00010\u0013\u0012\b\u00101\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b2\u00103J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010k\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u000b\u0010l\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010n\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010o\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010p\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010q\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010r\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010s\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010t\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010u\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010v\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010x\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010y\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010z\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010{\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u000b\u0010|\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010}\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%HÆ\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0011\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010DJ\u0012\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003JØ\u0003\u0010\u0089\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0003\u0010\u008a\u0001J\u0015\u0010\u008b\u0001\u001a\u00020\u00112\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u008e\u0001\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bI\u0010DR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bJ\u0010DR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bK\u0010DR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bL\u0010DR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bM\u0010DR\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bN\u0010DR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bO\u0010DR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bP\u0010DR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bQ\u0010DR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00106\u001a\u0004\bR\u00105R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bS\u0010DR\u0015\u0010 \u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bT\u0010DR\u0015\u0010!\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bU\u0010DR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\"\u0010DR\u0013\u0010#\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bV\u0010GR\u0019\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0015\u0010'\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\bY\u0010DR\u0013\u0010(\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010GR\u0015\u0010)\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b[\u0010DR\u0015\u0010*\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b\\\u0010DR\u0015\u0010+\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b]\u0010DR\u0015\u0010,\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b^\u0010DR\u0015\u0010-\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b_\u0010DR\u0015\u0010.\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010E\u001a\u0004\b`\u0010DR\u0019\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010%¢\u0006\b\n\u0000\u001a\u0004\ba\u0010XR\u0013\u00100\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bb\u0010GR\u0013\u00101\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bc\u0010G¨\u0006\u008f\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "", "accountId", "", ConstantsKt.ENV_FACING_MODE, "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;", "customization", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "errorLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "commonLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;", "nativeLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;", "exitRedirectLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ExitRedirectLabels;", "allowDesktop", "", Keys.KEY_LANGUAGE, "", "eventId", "deviceRiskRunnable", "disableNativeCapture", "disableFrontendCameraChecks", "enableNativeCaptureV5", "enableSplashBodyWarning", "enableCloseCaptureWindowButton", "enableGsaHeaderFooter", "enableRedirectOnTerminalError", "enableReducedManualTimeout", "manualCaptureTimeout", "enablePassportSignatureCapture", "enableExpandedCaptureAppCustomizations", "enableExitRedirect", "isInternal", "publicSdkKey", "trackingProperties", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/TrackingProperty;", "selfieEnabled", "useCaseType", "enableSecondaryV2View", "enableCaptureAppAutoSubmit", "enableAlternateModalImagePreview", "enableCustomWebViewCameraPermissionScreen", "enableAndroidPerformanceMonitoring", "forceDocumentVerificationWebRTCManual", "primaryImageFormat", "qrcode", "flowKey", "<init>", "(Ljava/lang/Integer;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ExitRedirectLabels;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnvironment", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;", "getCustomization", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;", "getErrorLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;", "getCommonLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;", "getNativeLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;", "getExitRedirectLabels", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ExitRedirectLabels;", "getAllowDesktop", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguage", "()Ljava/lang/String;", "getEventId", "getDeviceRiskRunnable", "getDisableNativeCapture", "getDisableFrontendCameraChecks", "getEnableNativeCaptureV5", "getEnableSplashBodyWarning", "getEnableCloseCaptureWindowButton", "getEnableGsaHeaderFooter", "getEnableRedirectOnTerminalError", "getEnableReducedManualTimeout", "getManualCaptureTimeout", "getEnablePassportSignatureCapture", "getEnableExpandedCaptureAppCustomizations", "getEnableExitRedirect", "getPublicSdkKey", "getTrackingProperties", "()Ljava/util/List;", "getSelfieEnabled", "getUseCaseType", "getEnableSecondaryV2View", "getEnableCaptureAppAutoSubmit", "getEnableAlternateModalImagePreview", "getEnableCustomWebViewCameraPermissionScreen", "getEnableAndroidPerformanceMonitoring", "getForceDocumentVerificationWebRTCManual", "getPrimaryImageFormat", "getQrcode", "getFlowKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "copy", "(Ljava/lang/Integer;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Environment;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Customization;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/CommonLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeLabels;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ExitRedirectLabels;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/GlobalConfig;", "equals", "other", "hashCode", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class GlobalConfig {
    public static final int $stable = 8;
    private final Integer accountId;
    private final Boolean allowDesktop;
    private final CommonLabels commonLabels;
    private final Customization customization;
    private final Boolean deviceRiskRunnable;
    private final Boolean disableFrontendCameraChecks;
    private final Boolean disableNativeCapture;
    private final Boolean enableAlternateModalImagePreview;
    private final Boolean enableAndroidPerformanceMonitoring;
    private final Boolean enableCaptureAppAutoSubmit;
    private final Boolean enableCloseCaptureWindowButton;
    private final Boolean enableCustomWebViewCameraPermissionScreen;
    private final Boolean enableExitRedirect;
    private final Boolean enableExpandedCaptureAppCustomizations;
    private final Boolean enableGsaHeaderFooter;
    private final Boolean enableNativeCaptureV5;
    private final Boolean enablePassportSignatureCapture;
    private final Boolean enableRedirectOnTerminalError;
    private final Boolean enableReducedManualTimeout;
    private final Boolean enableSecondaryV2View;
    private final Boolean enableSplashBodyWarning;
    private final Environment environment;
    private final ErrorLabels errorLabels;
    private final String eventId;
    private final ExitRedirectLabels exitRedirectLabels;
    private final String flowKey;
    private final Boolean forceDocumentVerificationWebRTCManual;
    private final Boolean isInternal;
    private final String language;
    private final Integer manualCaptureTimeout;
    private final NativeLabels nativeLabels;
    private final List<String> primaryImageFormat;
    private final String publicSdkKey;
    private final String qrcode;
    private final Boolean selfieEnabled;
    private final List<TrackingProperty> trackingProperties;
    private final String useCaseType;

    public GlobalConfig(Integer num, Environment environment, Customization customization, ErrorLabels errorLabels, CommonLabels commonLabels, NativeLabels nativeLabels, ExitRedirectLabels exitRedirectLabels, Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num2, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str3, List<TrackingProperty> list, Boolean bool15, String str4, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, List<String> list2, String str5, String str6) {
        this.accountId = num;
        this.environment = environment;
        this.customization = customization;
        this.errorLabels = errorLabels;
        this.commonLabels = commonLabels;
        this.nativeLabels = nativeLabels;
        this.exitRedirectLabels = exitRedirectLabels;
        this.allowDesktop = bool;
        this.language = str;
        this.eventId = str2;
        this.deviceRiskRunnable = bool2;
        this.disableNativeCapture = bool3;
        this.disableFrontendCameraChecks = bool4;
        this.enableNativeCaptureV5 = bool5;
        this.enableSplashBodyWarning = bool6;
        this.enableCloseCaptureWindowButton = bool7;
        this.enableGsaHeaderFooter = bool8;
        this.enableRedirectOnTerminalError = bool9;
        this.enableReducedManualTimeout = bool10;
        this.manualCaptureTimeout = num2;
        this.enablePassportSignatureCapture = bool11;
        this.enableExpandedCaptureAppCustomizations = bool12;
        this.enableExitRedirect = bool13;
        this.isInternal = bool14;
        this.publicSdkKey = str3;
        this.trackingProperties = list;
        this.selfieEnabled = bool15;
        this.useCaseType = str4;
        this.enableSecondaryV2View = bool16;
        this.enableCaptureAppAutoSubmit = bool17;
        this.enableAlternateModalImagePreview = bool18;
        this.enableCustomWebViewCameraPermissionScreen = bool19;
        this.enableAndroidPerformanceMonitoring = bool20;
        this.forceDocumentVerificationWebRTCManual = bool21;
        this.primaryImageFormat = list2;
        this.qrcode = str5;
        this.flowKey = str6;
    }

    public static /* synthetic */ GlobalConfig copy$default(GlobalConfig globalConfig, Integer num, Environment environment, Customization customization, ErrorLabels errorLabels, CommonLabels commonLabels, NativeLabels nativeLabels, ExitRedirectLabels exitRedirectLabels, Boolean bool, String str, String str2, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Integer num2, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str3, List list, Boolean bool15, String str4, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, List list2, String str5, String str6, int i, int i2, Object obj) {
        String str7;
        String str8;
        Boolean bool22;
        Boolean bool23;
        Boolean bool24;
        Boolean bool25;
        String str9;
        List list3;
        Boolean bool26;
        String str10;
        Boolean bool27;
        Boolean bool28;
        Boolean bool29;
        Boolean bool30;
        Boolean bool31;
        Boolean bool32;
        List list4;
        Boolean bool33;
        NativeLabels nativeLabels2;
        ExitRedirectLabels exitRedirectLabels2;
        Boolean bool34;
        String str11;
        String str12;
        Boolean bool35;
        Boolean bool36;
        Boolean bool37;
        Boolean bool38;
        Boolean bool39;
        Boolean bool40;
        Boolean bool41;
        Boolean bool42;
        Integer num3;
        Environment environment2;
        Customization customization2;
        ErrorLabels errorLabels2;
        CommonLabels commonLabels2;
        Integer num4 = (i & 1) != 0 ? globalConfig.accountId : num;
        Environment environment3 = (i & 2) != 0 ? globalConfig.environment : environment;
        Customization customization3 = (i & 4) != 0 ? globalConfig.customization : customization;
        ErrorLabels errorLabels3 = (i & 8) != 0 ? globalConfig.errorLabels : errorLabels;
        CommonLabels commonLabels3 = (i & 16) != 0 ? globalConfig.commonLabels : commonLabels;
        NativeLabels nativeLabels3 = (i & 32) != 0 ? globalConfig.nativeLabels : nativeLabels;
        ExitRedirectLabels exitRedirectLabels3 = (i & 64) != 0 ? globalConfig.exitRedirectLabels : exitRedirectLabels;
        Boolean bool43 = (i & 128) != 0 ? globalConfig.allowDesktop : bool;
        String str13 = (i & 256) != 0 ? globalConfig.language : str;
        String str14 = (i & Barcode.FORMAT_UPC_A) != 0 ? globalConfig.eventId : str2;
        Boolean bool44 = (i & Barcode.FORMAT_UPC_E) != 0 ? globalConfig.deviceRiskRunnable : bool2;
        Boolean bool45 = (i & 2048) != 0 ? globalConfig.disableNativeCapture : bool3;
        Boolean bool46 = (i & 4096) != 0 ? globalConfig.disableFrontendCameraChecks : bool4;
        Boolean bool47 = (i & 8192) != 0 ? globalConfig.enableNativeCaptureV5 : bool5;
        Integer num5 = num4;
        Boolean bool48 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? globalConfig.enableSplashBodyWarning : bool6;
        Boolean bool49 = (i & 32768) != 0 ? globalConfig.enableCloseCaptureWindowButton : bool7;
        Boolean bool50 = (i & 65536) != 0 ? globalConfig.enableGsaHeaderFooter : bool8;
        Boolean bool51 = (i & 131072) != 0 ? globalConfig.enableRedirectOnTerminalError : bool9;
        Boolean bool52 = (i & 262144) != 0 ? globalConfig.enableReducedManualTimeout : bool10;
        Integer num6 = (i & 524288) != 0 ? globalConfig.manualCaptureTimeout : num2;
        Boolean bool53 = (i & 1048576) != 0 ? globalConfig.enablePassportSignatureCapture : bool11;
        Boolean bool54 = (i & 2097152) != 0 ? globalConfig.enableExpandedCaptureAppCustomizations : bool12;
        Boolean bool55 = (i & 4194304) != 0 ? globalConfig.enableExitRedirect : bool13;
        Boolean bool56 = (i & 8388608) != 0 ? globalConfig.isInternal : bool14;
        String str15 = (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? globalConfig.publicSdkKey : str3;
        List list5 = (i & 33554432) != 0 ? globalConfig.trackingProperties : list;
        Boolean bool57 = (i & 67108864) != 0 ? globalConfig.selfieEnabled : bool15;
        String str16 = (i & 134217728) != 0 ? globalConfig.useCaseType : str4;
        Boolean bool58 = (i & 268435456) != 0 ? globalConfig.enableSecondaryV2View : bool16;
        Boolean bool59 = (i & 536870912) != 0 ? globalConfig.enableCaptureAppAutoSubmit : bool17;
        Boolean bool60 = (i & 1073741824) != 0 ? globalConfig.enableAlternateModalImagePreview : bool18;
        Boolean bool61 = (i & Integer.MIN_VALUE) != 0 ? globalConfig.enableCustomWebViewCameraPermissionScreen : bool19;
        Boolean bool62 = (i2 & 1) != 0 ? globalConfig.enableAndroidPerformanceMonitoring : bool20;
        Boolean bool63 = (i2 & 2) != 0 ? globalConfig.forceDocumentVerificationWebRTCManual : bool21;
        List list6 = (i2 & 4) != 0 ? globalConfig.primaryImageFormat : list2;
        String str17 = (i2 & 8) != 0 ? globalConfig.qrcode : str5;
        if ((i2 & 16) != 0) {
            str8 = str17;
            str7 = globalConfig.flowKey;
            bool23 = bool54;
            bool24 = bool55;
            bool25 = bool56;
            str9 = str15;
            list3 = list5;
            bool26 = bool57;
            str10 = str16;
            bool27 = bool58;
            bool28 = bool59;
            bool29 = bool60;
            bool30 = bool61;
            bool31 = bool62;
            bool32 = bool63;
            list4 = list6;
            bool33 = bool48;
            exitRedirectLabels2 = exitRedirectLabels3;
            bool34 = bool43;
            str11 = str13;
            str12 = str14;
            bool35 = bool44;
            bool36 = bool45;
            bool37 = bool46;
            bool38 = bool47;
            bool39 = bool49;
            bool40 = bool50;
            bool41 = bool51;
            bool42 = bool52;
            num3 = num6;
            bool22 = bool53;
            environment2 = environment3;
            customization2 = customization3;
            errorLabels2 = errorLabels3;
            commonLabels2 = commonLabels3;
            nativeLabels2 = nativeLabels3;
        } else {
            str7 = str6;
            str8 = str17;
            bool22 = bool53;
            bool23 = bool54;
            bool24 = bool55;
            bool25 = bool56;
            str9 = str15;
            list3 = list5;
            bool26 = bool57;
            str10 = str16;
            bool27 = bool58;
            bool28 = bool59;
            bool29 = bool60;
            bool30 = bool61;
            bool31 = bool62;
            bool32 = bool63;
            list4 = list6;
            bool33 = bool48;
            nativeLabels2 = nativeLabels3;
            exitRedirectLabels2 = exitRedirectLabels3;
            bool34 = bool43;
            str11 = str13;
            str12 = str14;
            bool35 = bool44;
            bool36 = bool45;
            bool37 = bool46;
            bool38 = bool47;
            bool39 = bool49;
            bool40 = bool50;
            bool41 = bool51;
            bool42 = bool52;
            num3 = num6;
            environment2 = environment3;
            customization2 = customization3;
            errorLabels2 = errorLabels3;
            commonLabels2 = commonLabels3;
        }
        return globalConfig.copy(num5, environment2, customization2, errorLabels2, commonLabels2, nativeLabels2, exitRedirectLabels2, bool34, str11, str12, bool35, bool36, bool37, bool38, bool33, bool39, bool40, bool41, bool42, num3, bool22, bool23, bool24, bool25, str9, list3, bool26, str10, bool27, bool28, bool29, bool30, bool31, bool32, list4, str8, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getAccountId() {
        return this.accountId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getDeviceRiskRunnable() {
        return this.deviceRiskRunnable;
    }

    /* renamed from: component12, reason: from getter */
    public final Boolean getDisableNativeCapture() {
        return this.disableNativeCapture;
    }

    /* renamed from: component13, reason: from getter */
    public final Boolean getDisableFrontendCameraChecks() {
        return this.disableFrontendCameraChecks;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getEnableNativeCaptureV5() {
        return this.enableNativeCaptureV5;
    }

    /* renamed from: component15, reason: from getter */
    public final Boolean getEnableSplashBodyWarning() {
        return this.enableSplashBodyWarning;
    }

    /* renamed from: component16, reason: from getter */
    public final Boolean getEnableCloseCaptureWindowButton() {
        return this.enableCloseCaptureWindowButton;
    }

    /* renamed from: component17, reason: from getter */
    public final Boolean getEnableGsaHeaderFooter() {
        return this.enableGsaHeaderFooter;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getEnableRedirectOnTerminalError() {
        return this.enableRedirectOnTerminalError;
    }

    /* renamed from: component19, reason: from getter */
    public final Boolean getEnableReducedManualTimeout() {
        return this.enableReducedManualTimeout;
    }

    /* renamed from: component2, reason: from getter */
    public final Environment getEnvironment() {
        return this.environment;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getManualCaptureTimeout() {
        return this.manualCaptureTimeout;
    }

    /* renamed from: component21, reason: from getter */
    public final Boolean getEnablePassportSignatureCapture() {
        return this.enablePassportSignatureCapture;
    }

    /* renamed from: component22, reason: from getter */
    public final Boolean getEnableExpandedCaptureAppCustomizations() {
        return this.enableExpandedCaptureAppCustomizations;
    }

    /* renamed from: component23, reason: from getter */
    public final Boolean getEnableExitRedirect() {
        return this.enableExitRedirect;
    }

    /* renamed from: component24, reason: from getter */
    public final Boolean getIsInternal() {
        return this.isInternal;
    }

    /* renamed from: component25, reason: from getter */
    public final String getPublicSdkKey() {
        return this.publicSdkKey;
    }

    public final List<TrackingProperty> component26() {
        return this.trackingProperties;
    }

    /* renamed from: component27, reason: from getter */
    public final Boolean getSelfieEnabled() {
        return this.selfieEnabled;
    }

    /* renamed from: component28, reason: from getter */
    public final String getUseCaseType() {
        return this.useCaseType;
    }

    /* renamed from: component29, reason: from getter */
    public final Boolean getEnableSecondaryV2View() {
        return this.enableSecondaryV2View;
    }

    /* renamed from: component3, reason: from getter */
    public final Customization getCustomization() {
        return this.customization;
    }

    /* renamed from: component30, reason: from getter */
    public final Boolean getEnableCaptureAppAutoSubmit() {
        return this.enableCaptureAppAutoSubmit;
    }

    /* renamed from: component31, reason: from getter */
    public final Boolean getEnableAlternateModalImagePreview() {
        return this.enableAlternateModalImagePreview;
    }

    /* renamed from: component32, reason: from getter */
    public final Boolean getEnableCustomWebViewCameraPermissionScreen() {
        return this.enableCustomWebViewCameraPermissionScreen;
    }

    /* renamed from: component33, reason: from getter */
    public final Boolean getEnableAndroidPerformanceMonitoring() {
        return this.enableAndroidPerformanceMonitoring;
    }

    /* renamed from: component34, reason: from getter */
    public final Boolean getForceDocumentVerificationWebRTCManual() {
        return this.forceDocumentVerificationWebRTCManual;
    }

    public final List<String> component35() {
        return this.primaryImageFormat;
    }

    /* renamed from: component36, reason: from getter */
    public final String getQrcode() {
        return this.qrcode;
    }

    /* renamed from: component37, reason: from getter */
    public final String getFlowKey() {
        return this.flowKey;
    }

    /* renamed from: component4, reason: from getter */
    public final ErrorLabels getErrorLabels() {
        return this.errorLabels;
    }

    /* renamed from: component5, reason: from getter */
    public final CommonLabels getCommonLabels() {
        return this.commonLabels;
    }

    /* renamed from: component6, reason: from getter */
    public final NativeLabels getNativeLabels() {
        return this.nativeLabels;
    }

    /* renamed from: component7, reason: from getter */
    public final ExitRedirectLabels getExitRedirectLabels() {
        return this.exitRedirectLabels;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getAllowDesktop() {
        return this.allowDesktop;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    public final GlobalConfig copy(Integer accountId, Environment environment, Customization customization, ErrorLabels errorLabels, CommonLabels commonLabels, NativeLabels nativeLabels, ExitRedirectLabels exitRedirectLabels, Boolean allowDesktop, String language, String eventId, Boolean deviceRiskRunnable, Boolean disableNativeCapture, Boolean disableFrontendCameraChecks, Boolean enableNativeCaptureV5, Boolean enableSplashBodyWarning, Boolean enableCloseCaptureWindowButton, Boolean enableGsaHeaderFooter, Boolean enableRedirectOnTerminalError, Boolean enableReducedManualTimeout, Integer manualCaptureTimeout, Boolean enablePassportSignatureCapture, Boolean enableExpandedCaptureAppCustomizations, Boolean enableExitRedirect, Boolean isInternal, String publicSdkKey, List<TrackingProperty> trackingProperties, Boolean selfieEnabled, String useCaseType, Boolean enableSecondaryV2View, Boolean enableCaptureAppAutoSubmit, Boolean enableAlternateModalImagePreview, Boolean enableCustomWebViewCameraPermissionScreen, Boolean enableAndroidPerformanceMonitoring, Boolean forceDocumentVerificationWebRTCManual, List<String> primaryImageFormat, String qrcode, String flowKey) {
        return new GlobalConfig(accountId, environment, customization, errorLabels, commonLabels, nativeLabels, exitRedirectLabels, allowDesktop, language, eventId, deviceRiskRunnable, disableNativeCapture, disableFrontendCameraChecks, enableNativeCaptureV5, enableSplashBodyWarning, enableCloseCaptureWindowButton, enableGsaHeaderFooter, enableRedirectOnTerminalError, enableReducedManualTimeout, manualCaptureTimeout, enablePassportSignatureCapture, enableExpandedCaptureAppCustomizations, enableExitRedirect, isInternal, publicSdkKey, trackingProperties, selfieEnabled, useCaseType, enableSecondaryV2View, enableCaptureAppAutoSubmit, enableAlternateModalImagePreview, enableCustomWebViewCameraPermissionScreen, enableAndroidPerformanceMonitoring, forceDocumentVerificationWebRTCManual, primaryImageFormat, qrcode, flowKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlobalConfig)) {
            return false;
        }
        GlobalConfig globalConfig = (GlobalConfig) other;
        if (Intrinsics.areEqual(this.accountId, globalConfig.accountId) && Intrinsics.areEqual(this.environment, globalConfig.environment) && Intrinsics.areEqual(this.customization, globalConfig.customization) && Intrinsics.areEqual(this.errorLabels, globalConfig.errorLabels) && Intrinsics.areEqual(this.commonLabels, globalConfig.commonLabels) && Intrinsics.areEqual(this.nativeLabels, globalConfig.nativeLabels) && Intrinsics.areEqual(this.exitRedirectLabels, globalConfig.exitRedirectLabels) && Intrinsics.areEqual(this.allowDesktop, globalConfig.allowDesktop) && Intrinsics.areEqual(this.language, globalConfig.language) && Intrinsics.areEqual(this.eventId, globalConfig.eventId) && Intrinsics.areEqual(this.deviceRiskRunnable, globalConfig.deviceRiskRunnable) && Intrinsics.areEqual(this.disableNativeCapture, globalConfig.disableNativeCapture) && Intrinsics.areEqual(this.disableFrontendCameraChecks, globalConfig.disableFrontendCameraChecks) && Intrinsics.areEqual(this.enableNativeCaptureV5, globalConfig.enableNativeCaptureV5) && Intrinsics.areEqual(this.enableSplashBodyWarning, globalConfig.enableSplashBodyWarning) && Intrinsics.areEqual(this.enableCloseCaptureWindowButton, globalConfig.enableCloseCaptureWindowButton) && Intrinsics.areEqual(this.enableGsaHeaderFooter, globalConfig.enableGsaHeaderFooter) && Intrinsics.areEqual(this.enableRedirectOnTerminalError, globalConfig.enableRedirectOnTerminalError) && Intrinsics.areEqual(this.enableReducedManualTimeout, globalConfig.enableReducedManualTimeout) && Intrinsics.areEqual(this.manualCaptureTimeout, globalConfig.manualCaptureTimeout) && Intrinsics.areEqual(this.enablePassportSignatureCapture, globalConfig.enablePassportSignatureCapture) && Intrinsics.areEqual(this.enableExpandedCaptureAppCustomizations, globalConfig.enableExpandedCaptureAppCustomizations) && Intrinsics.areEqual(this.enableExitRedirect, globalConfig.enableExitRedirect) && Intrinsics.areEqual(this.isInternal, globalConfig.isInternal) && Intrinsics.areEqual(this.publicSdkKey, globalConfig.publicSdkKey) && Intrinsics.areEqual(this.trackingProperties, globalConfig.trackingProperties) && Intrinsics.areEqual(this.selfieEnabled, globalConfig.selfieEnabled) && Intrinsics.areEqual(this.useCaseType, globalConfig.useCaseType) && Intrinsics.areEqual(this.enableSecondaryV2View, globalConfig.enableSecondaryV2View) && Intrinsics.areEqual(this.enableCaptureAppAutoSubmit, globalConfig.enableCaptureAppAutoSubmit) && Intrinsics.areEqual(this.enableAlternateModalImagePreview, globalConfig.enableAlternateModalImagePreview) && Intrinsics.areEqual(this.enableCustomWebViewCameraPermissionScreen, globalConfig.enableCustomWebViewCameraPermissionScreen) && Intrinsics.areEqual(this.enableAndroidPerformanceMonitoring, globalConfig.enableAndroidPerformanceMonitoring) && Intrinsics.areEqual(this.forceDocumentVerificationWebRTCManual, globalConfig.forceDocumentVerificationWebRTCManual) && Intrinsics.areEqual(this.primaryImageFormat, globalConfig.primaryImageFormat) && Intrinsics.areEqual(this.qrcode, globalConfig.qrcode) && Intrinsics.areEqual(this.flowKey, globalConfig.flowKey)) {
            return true;
        }
        return false;
    }

    public final Integer getAccountId() {
        return this.accountId;
    }

    public final Boolean getAllowDesktop() {
        return this.allowDesktop;
    }

    public final CommonLabels getCommonLabels() {
        return this.commonLabels;
    }

    public final Customization getCustomization() {
        return this.customization;
    }

    public final Boolean getDeviceRiskRunnable() {
        return this.deviceRiskRunnable;
    }

    public final Boolean getDisableFrontendCameraChecks() {
        return this.disableFrontendCameraChecks;
    }

    public final Boolean getDisableNativeCapture() {
        return this.disableNativeCapture;
    }

    public final Boolean getEnableAlternateModalImagePreview() {
        return this.enableAlternateModalImagePreview;
    }

    public final Boolean getEnableAndroidPerformanceMonitoring() {
        return this.enableAndroidPerformanceMonitoring;
    }

    public final Boolean getEnableCaptureAppAutoSubmit() {
        return this.enableCaptureAppAutoSubmit;
    }

    public final Boolean getEnableCloseCaptureWindowButton() {
        return this.enableCloseCaptureWindowButton;
    }

    public final Boolean getEnableCustomWebViewCameraPermissionScreen() {
        return this.enableCustomWebViewCameraPermissionScreen;
    }

    public final Boolean getEnableExitRedirect() {
        return this.enableExitRedirect;
    }

    public final Boolean getEnableExpandedCaptureAppCustomizations() {
        return this.enableExpandedCaptureAppCustomizations;
    }

    public final Boolean getEnableGsaHeaderFooter() {
        return this.enableGsaHeaderFooter;
    }

    public final Boolean getEnableNativeCaptureV5() {
        return this.enableNativeCaptureV5;
    }

    public final Boolean getEnablePassportSignatureCapture() {
        return this.enablePassportSignatureCapture;
    }

    public final Boolean getEnableRedirectOnTerminalError() {
        return this.enableRedirectOnTerminalError;
    }

    public final Boolean getEnableReducedManualTimeout() {
        return this.enableReducedManualTimeout;
    }

    public final Boolean getEnableSecondaryV2View() {
        return this.enableSecondaryV2View;
    }

    public final Boolean getEnableSplashBodyWarning() {
        return this.enableSplashBodyWarning;
    }

    public final Environment getEnvironment() {
        return this.environment;
    }

    public final ErrorLabels getErrorLabels() {
        return this.errorLabels;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final ExitRedirectLabels getExitRedirectLabels() {
        return this.exitRedirectLabels;
    }

    public final String getFlowKey() {
        return this.flowKey;
    }

    public final Boolean getForceDocumentVerificationWebRTCManual() {
        return this.forceDocumentVerificationWebRTCManual;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getManualCaptureTimeout() {
        return this.manualCaptureTimeout;
    }

    public final NativeLabels getNativeLabels() {
        return this.nativeLabels;
    }

    public final List<String> getPrimaryImageFormat() {
        return this.primaryImageFormat;
    }

    public final String getPublicSdkKey() {
        return this.publicSdkKey;
    }

    public final String getQrcode() {
        return this.qrcode;
    }

    public final Boolean getSelfieEnabled() {
        return this.selfieEnabled;
    }

    public final List<TrackingProperty> getTrackingProperties() {
        return this.trackingProperties;
    }

    public final String getUseCaseType() {
        return this.useCaseType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32;
        int hashCode33;
        int hashCode34;
        int hashCode35;
        int hashCode36;
        Integer num = this.accountId;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Environment environment = this.environment;
        if (environment == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = environment.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Customization customization = this.customization;
        if (customization == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = customization.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ErrorLabels errorLabels = this.errorLabels;
        if (errorLabels == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = errorLabels.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        CommonLabels commonLabels = this.commonLabels;
        if (commonLabels == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = commonLabels.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        NativeLabels nativeLabels = this.nativeLabels;
        if (nativeLabels == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = nativeLabels.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        ExitRedirectLabels exitRedirectLabels = this.exitRedirectLabels;
        if (exitRedirectLabels == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = exitRedirectLabels.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        Boolean bool = this.allowDesktop;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str = this.language;
        if (str == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str2 = this.eventId;
        if (str2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str2.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        Boolean bool2 = this.deviceRiskRunnable;
        if (bool2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        Boolean bool3 = this.disableNativeCapture;
        if (bool3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = bool3.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        Boolean bool4 = this.disableFrontendCameraChecks;
        if (bool4 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool4.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        Boolean bool5 = this.enableNativeCaptureV5;
        if (bool5 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool5.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        Boolean bool6 = this.enableSplashBodyWarning;
        if (bool6 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool6.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Boolean bool7 = this.enableCloseCaptureWindowButton;
        if (bool7 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool7.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Boolean bool8 = this.enableGsaHeaderFooter;
        if (bool8 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = bool8.hashCode();
        }
        int i18 = (i17 + hashCode17) * 31;
        Boolean bool9 = this.enableRedirectOnTerminalError;
        if (bool9 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = bool9.hashCode();
        }
        int i19 = (i18 + hashCode18) * 31;
        Boolean bool10 = this.enableReducedManualTimeout;
        if (bool10 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = bool10.hashCode();
        }
        int i20 = (i19 + hashCode19) * 31;
        Integer num2 = this.manualCaptureTimeout;
        if (num2 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = num2.hashCode();
        }
        int i21 = (i20 + hashCode20) * 31;
        Boolean bool11 = this.enablePassportSignatureCapture;
        if (bool11 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = bool11.hashCode();
        }
        int i22 = (i21 + hashCode21) * 31;
        Boolean bool12 = this.enableExpandedCaptureAppCustomizations;
        if (bool12 == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = bool12.hashCode();
        }
        int i23 = (i22 + hashCode22) * 31;
        Boolean bool13 = this.enableExitRedirect;
        if (bool13 == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = bool13.hashCode();
        }
        int i24 = (i23 + hashCode23) * 31;
        Boolean bool14 = this.isInternal;
        if (bool14 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = bool14.hashCode();
        }
        int i25 = (i24 + hashCode24) * 31;
        String str3 = this.publicSdkKey;
        if (str3 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str3.hashCode();
        }
        int i26 = (i25 + hashCode25) * 31;
        List<TrackingProperty> list = this.trackingProperties;
        if (list == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = list.hashCode();
        }
        int i27 = (i26 + hashCode26) * 31;
        Boolean bool15 = this.selfieEnabled;
        if (bool15 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = bool15.hashCode();
        }
        int i28 = (i27 + hashCode27) * 31;
        String str4 = this.useCaseType;
        if (str4 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str4.hashCode();
        }
        int i29 = (i28 + hashCode28) * 31;
        Boolean bool16 = this.enableSecondaryV2View;
        if (bool16 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = bool16.hashCode();
        }
        int i30 = (i29 + hashCode29) * 31;
        Boolean bool17 = this.enableCaptureAppAutoSubmit;
        if (bool17 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = bool17.hashCode();
        }
        int i31 = (i30 + hashCode30) * 31;
        Boolean bool18 = this.enableAlternateModalImagePreview;
        if (bool18 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = bool18.hashCode();
        }
        int i32 = (i31 + hashCode31) * 31;
        Boolean bool19 = this.enableCustomWebViewCameraPermissionScreen;
        if (bool19 == null) {
            hashCode32 = 0;
        } else {
            hashCode32 = bool19.hashCode();
        }
        int i33 = (i32 + hashCode32) * 31;
        Boolean bool20 = this.enableAndroidPerformanceMonitoring;
        if (bool20 == null) {
            hashCode33 = 0;
        } else {
            hashCode33 = bool20.hashCode();
        }
        int i34 = (i33 + hashCode33) * 31;
        Boolean bool21 = this.forceDocumentVerificationWebRTCManual;
        if (bool21 == null) {
            hashCode34 = 0;
        } else {
            hashCode34 = bool21.hashCode();
        }
        int i35 = (i34 + hashCode34) * 31;
        List<String> list2 = this.primaryImageFormat;
        if (list2 == null) {
            hashCode35 = 0;
        } else {
            hashCode35 = list2.hashCode();
        }
        int i36 = (i35 + hashCode35) * 31;
        String str5 = this.qrcode;
        if (str5 == null) {
            hashCode36 = 0;
        } else {
            hashCode36 = str5.hashCode();
        }
        int i37 = (i36 + hashCode36) * 31;
        String str6 = this.flowKey;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i37 + i;
    }

    public final Boolean isInternal() {
        return this.isInternal;
    }

    public String toString() {
        Integer num = this.accountId;
        Environment environment = this.environment;
        Customization customization = this.customization;
        ErrorLabels errorLabels = this.errorLabels;
        CommonLabels commonLabels = this.commonLabels;
        NativeLabels nativeLabels = this.nativeLabels;
        ExitRedirectLabels exitRedirectLabels = this.exitRedirectLabels;
        Boolean bool = this.allowDesktop;
        String str = this.language;
        String str2 = this.eventId;
        Boolean bool2 = this.deviceRiskRunnable;
        Boolean bool3 = this.disableNativeCapture;
        Boolean bool4 = this.disableFrontendCameraChecks;
        Boolean bool5 = this.enableNativeCaptureV5;
        Boolean bool6 = this.enableSplashBodyWarning;
        Boolean bool7 = this.enableCloseCaptureWindowButton;
        Boolean bool8 = this.enableGsaHeaderFooter;
        Boolean bool9 = this.enableRedirectOnTerminalError;
        Boolean bool10 = this.enableReducedManualTimeout;
        Integer num2 = this.manualCaptureTimeout;
        Boolean bool11 = this.enablePassportSignatureCapture;
        Boolean bool12 = this.enableExpandedCaptureAppCustomizations;
        Boolean bool13 = this.enableExitRedirect;
        Boolean bool14 = this.isInternal;
        String str3 = this.publicSdkKey;
        List<TrackingProperty> list = this.trackingProperties;
        Boolean bool15 = this.selfieEnabled;
        String str4 = this.useCaseType;
        Boolean bool16 = this.enableSecondaryV2View;
        Boolean bool17 = this.enableCaptureAppAutoSubmit;
        Boolean bool18 = this.enableAlternateModalImagePreview;
        Boolean bool19 = this.enableCustomWebViewCameraPermissionScreen;
        Boolean bool20 = this.enableAndroidPerformanceMonitoring;
        Boolean bool21 = this.forceDocumentVerificationWebRTCManual;
        List<String> list2 = this.primaryImageFormat;
        String str5 = this.qrcode;
        String str6 = this.flowKey;
        StringBuilder sb = new StringBuilder("GlobalConfig(accountId=");
        sb.append(num);
        sb.append(", environment=");
        sb.append(environment);
        sb.append(", customization=");
        sb.append(customization);
        sb.append(", errorLabels=");
        sb.append(errorLabels);
        sb.append(", commonLabels=");
        sb.append(commonLabels);
        sb.append(", nativeLabels=");
        sb.append(nativeLabels);
        sb.append(", exitRedirectLabels=");
        sb.append(exitRedirectLabels);
        sb.append(", allowDesktop=");
        sb.append(bool);
        sb.append(", language=");
        k84.q(sb, str, ", eventId=", str2, ", deviceRiskRunnable=");
        hdi.A(sb, bool2, ", disableNativeCapture=", bool3, ", disableFrontendCameraChecks=");
        hdi.A(sb, bool4, ", enableNativeCaptureV5=", bool5, ", enableSplashBodyWarning=");
        hdi.A(sb, bool6, ", enableCloseCaptureWindowButton=", bool7, ", enableGsaHeaderFooter=");
        hdi.A(sb, bool8, ", enableRedirectOnTerminalError=", bool9, ", enableReducedManualTimeout=");
        sb.append(bool10);
        sb.append(", manualCaptureTimeout=");
        sb.append(num2);
        sb.append(", enablePassportSignatureCapture=");
        hdi.A(sb, bool11, ", enableExpandedCaptureAppCustomizations=", bool12, ", enableExitRedirect=");
        hdi.A(sb, bool13, ", isInternal=", bool14, ", publicSdkKey=");
        ace.C(sb, str3, ", trackingProperties=", list, ", selfieEnabled=");
        sb.append(bool15);
        sb.append(", useCaseType=");
        sb.append(str4);
        sb.append(", enableSecondaryV2View=");
        hdi.A(sb, bool16, ", enableCaptureAppAutoSubmit=", bool17, ", enableAlternateModalImagePreview=");
        hdi.A(sb, bool18, ", enableCustomWebViewCameraPermissionScreen=", bool19, ", enableAndroidPerformanceMonitoring=");
        hdi.A(sb, bool20, ", forceDocumentVerificationWebRTCManual=", bool21, ", primaryImageFormat=");
        sb.append(list2);
        sb.append(", qrcode=");
        sb.append(str5);
        sb.append(", flowKey=");
        return woa.r(sb, str6, ")");
    }
}
