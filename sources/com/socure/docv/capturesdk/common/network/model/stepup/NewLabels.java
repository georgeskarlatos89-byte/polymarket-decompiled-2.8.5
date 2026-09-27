package com.socure.docv.capturesdk.common.network.model.stepup;

import com.fingerprintjs.android.fpjs_pro.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\bý\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bý\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0001\u0010 \u001a\u00020\u0003\u0012\b\b\u0001\u0010!\u001a\u00020\u0003\u0012\b\b\u0001\u0010\"\u001a\u00020\u0003\u0012\b\b\u0001\u0010#\u001a\u00020\u0003\u0012\b\b\u0001\u0010$\u001a\u00020\u0003\u0012\b\b\u0001\u0010%\u001a\u00020\u0003\u0012\b\b\u0001\u0010&\u001a\u00020\u0003\u0012\b\b\u0001\u0010'\u001a\u00020\u0003\u0012\b\b\u0001\u0010(\u001a\u00020\u0003\u0012\b\b\u0001\u0010)\u001a\u00020\u0003\u0012\b\b\u0001\u0010*\u001a\u00020\u0003\u0012\b\b\u0001\u0010+\u001a\u00020\u0003\u0012\b\b\u0001\u0010,\u001a\u00020\u0003\u0012\b\b\u0001\u0010-\u001a\u00020\u0003\u0012\b\b\u0001\u0010.\u001a\u00020\u0003\u0012\b\b\u0001\u0010/\u001a\u00020\u0003\u0012\b\b\u0001\u00100\u001a\u00020\u0003\u0012\b\b\u0001\u00101\u001a\u00020\u0003\u0012\b\b\u0001\u00102\u001a\u00020\u0003\u0012\b\b\u0001\u00103\u001a\u00020\u0003\u0012\b\b\u0001\u00104\u001a\u00020\u0003\u0012\b\b\u0001\u00105\u001a\u00020\u0003\u0012\b\b\u0001\u00106\u001a\u00020\u0003\u0012\b\b\u0001\u00107\u001a\u00020\u0003\u0012\b\b\u0001\u00108\u001a\u00020\u0003\u0012\b\b\u0001\u00109\u001a\u00020\u0003\u0012\b\b\u0001\u0010:\u001a\u00020\u0003\u0012\b\b\u0001\u0010;\u001a\u00020\u0003\u0012\b\b\u0001\u0010<\u001a\u00020\u0003\u0012\b\b\u0001\u0010=\u001a\u00020\u0003\u0012\b\b\u0001\u0010>\u001a\u00020\u0003\u0012\b\b\u0001\u0010?\u001a\u00020\u0003\u0012\b\b\u0001\u0010@\u001a\u00020\u0003\u0012\b\b\u0001\u0010A\u001a\u00020\u0003¢\u0006\u0004\bB\u0010CJ\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010þ\u0001\u001a\u00020\u0003HÆ\u0003J\u0080\u0005\u0010ÿ\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u001e\u001a\u00020\u00032\b\b\u0003\u0010\u001f\u001a\u00020\u00032\b\b\u0003\u0010 \u001a\u00020\u00032\b\b\u0003\u0010!\u001a\u00020\u00032\b\b\u0003\u0010\"\u001a\u00020\u00032\b\b\u0003\u0010#\u001a\u00020\u00032\b\b\u0003\u0010$\u001a\u00020\u00032\b\b\u0003\u0010%\u001a\u00020\u00032\b\b\u0003\u0010&\u001a\u00020\u00032\b\b\u0003\u0010'\u001a\u00020\u00032\b\b\u0003\u0010(\u001a\u00020\u00032\b\b\u0003\u0010)\u001a\u00020\u00032\b\b\u0003\u0010*\u001a\u00020\u00032\b\b\u0003\u0010+\u001a\u00020\u00032\b\b\u0003\u0010,\u001a\u00020\u00032\b\b\u0003\u0010-\u001a\u00020\u00032\b\b\u0003\u0010.\u001a\u00020\u00032\b\b\u0003\u0010/\u001a\u00020\u00032\b\b\u0003\u00100\u001a\u00020\u00032\b\b\u0003\u00101\u001a\u00020\u00032\b\b\u0003\u00102\u001a\u00020\u00032\b\b\u0003\u00103\u001a\u00020\u00032\b\b\u0003\u00104\u001a\u00020\u00032\b\b\u0003\u00105\u001a\u00020\u00032\b\b\u0003\u00106\u001a\u00020\u00032\b\b\u0003\u00107\u001a\u00020\u00032\b\b\u0003\u00108\u001a\u00020\u00032\b\b\u0003\u00109\u001a\u00020\u00032\b\b\u0003\u0010:\u001a\u00020\u00032\b\b\u0003\u0010;\u001a\u00020\u00032\b\b\u0003\u0010<\u001a\u00020\u00032\b\b\u0003\u0010=\u001a\u00020\u00032\b\b\u0003\u0010>\u001a\u00020\u00032\b\b\u0003\u0010?\u001a\u00020\u00032\b\b\u0003\u0010@\u001a\u00020\u00032\b\b\u0003\u0010A\u001a\u00020\u0003HÆ\u0001J\u0016\u0010\u0080\u0002\u001a\u00030\u0081\u00022\t\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0083\u0002\u001a\u00030\u0084\u0002HÖ\u0001J\n\u0010\u0085\u0002\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010E\"\u0004\bI\u0010GR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010E\"\u0004\bM\u0010GR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010E\"\u0004\bO\u0010GR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010E\"\u0004\bQ\u0010GR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010E\"\u0004\bS\u0010GR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010E\"\u0004\bU\u0010GR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010E\"\u0004\bW\u0010GR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010E\"\u0004\bY\u0010GR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010E\"\u0004\b[\u0010GR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010E\"\u0004\b]\u0010GR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010E\"\u0004\b_\u0010GR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010E\"\u0004\ba\u0010GR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010E\"\u0004\bc\u0010GR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010E\"\u0004\be\u0010GR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010E\"\u0004\bg\u0010GR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010E\"\u0004\bi\u0010GR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010E\"\u0004\bk\u0010GR\u001a\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010E\"\u0004\bm\u0010GR\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010E\"\u0004\bo\u0010GR\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010E\"\u0004\bq\u0010GR\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010E\"\u0004\br\u0010GR\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010E\"\u0004\bs\u0010GR\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010E\"\u0004\bt\u0010GR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010E\"\u0004\bu\u0010GR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010E\"\u0004\bw\u0010GR\u001a\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010E\"\u0004\by\u0010GR\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010E\"\u0004\b{\u0010GR\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010E\"\u0004\b}\u0010GR\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010E\"\u0004\b\u007f\u0010GR\u001c\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010E\"\u0005\b\u0081\u0001\u0010GR\u001c\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010E\"\u0005\b\u0083\u0001\u0010GR\u001c\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010E\"\u0005\b\u0085\u0001\u0010GR\u001c\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010E\"\u0005\b\u0087\u0001\u0010GR\u001c\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010E\"\u0005\b\u0089\u0001\u0010GR\u001c\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010E\"\u0005\b\u008b\u0001\u0010GR\u001c\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010E\"\u0005\b\u008d\u0001\u0010GR\u001c\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010E\"\u0005\b\u008f\u0001\u0010GR\u001c\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010E\"\u0005\b\u0091\u0001\u0010GR\u001c\u0010+\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010E\"\u0005\b\u0093\u0001\u0010GR\u001c\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010E\"\u0005\b\u0095\u0001\u0010GR\u001c\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010E\"\u0005\b\u0097\u0001\u0010GR\u001c\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010E\"\u0005\b\u0099\u0001\u0010GR\u001c\u0010/\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010E\"\u0005\b\u009b\u0001\u0010GR\u001c\u00100\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010E\"\u0005\b\u009d\u0001\u0010GR\u001c\u00101\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010E\"\u0005\b\u009f\u0001\u0010GR\u001c\u00102\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010E\"\u0005\b¡\u0001\u0010GR\u001c\u00103\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010E\"\u0005\b£\u0001\u0010GR\u001c\u00104\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010E\"\u0005\b¥\u0001\u0010GR\u001c\u00105\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010E\"\u0005\b§\u0001\u0010GR\u001c\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010E\"\u0005\b©\u0001\u0010GR\u001c\u00107\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010E\"\u0005\b«\u0001\u0010GR\u001c\u00108\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010E\"\u0005\b\u00ad\u0001\u0010GR\u001c\u00109\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010E\"\u0005\b¯\u0001\u0010GR\u001c\u0010:\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010E\"\u0005\b±\u0001\u0010GR\u001c\u0010;\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010E\"\u0005\b³\u0001\u0010GR\u001c\u0010<\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010E\"\u0005\bµ\u0001\u0010GR\u001c\u0010=\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010E\"\u0005\b·\u0001\u0010GR\u001c\u0010>\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010E\"\u0005\b¹\u0001\u0010GR\u001c\u0010?\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010E\"\u0005\b»\u0001\u0010GR\u001c\u0010@\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010E\"\u0005\b½\u0001\u0010GR\u001c\u0010A\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010E\"\u0005\b¿\u0001\u0010G¨\u0006\u0086\u0002"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "", "adjustLighting", "", "alignFaceBox", "alignFaceFrame", "backCapture", "backSideCaptured", "backToScanning", "captureSuccess", "alignDocumentId", "alignDocumentPassport", "ensureIdFocus", "ensurePassportFocus", "faceMustBeVisible", "flipIdBarcode", "flipYourId", "focusCameraId", "focusCameraPassport", "frontCapture", "frontSideCaptured", "greatNowCapture", "holdDevice", "holdPhoneOverId", "holdPhoneOverPassport", "isAllInfoVisible", "isAllInfoVisibleBarcode", "isAllInfoVisiblePassport", "isYourFaceInFrame", "lookDirectly", "makeSureBarcode", "moveCloser", "movePhoneFront", "openPassport", "passportCapture", "passportCaptured", "placeFlatAndHoldId", "placeFlatAndHoldPassport", "placeIdFlat", "retake", "selfieCapture", "selfieCaptured", "toGetStarted", "invalidImage", "submitImageForValidation", "validatingImage", "imageValidated", "processing", "success", "cameraPermissionMsg", "cameraPermissionTitle", "cameraPermissionButton", "backPressWarningMsg", "previewDocSubmit", "previewSelfieSubmit", "faceTooClose", "pleaseWait", "movePhoneBack", "idTooClose", "passportTooClose", "faceNotParallel", "docSelectSubText", "docIdSubText", "docPassportSubText", "docReady", "docCameraPermission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdjustLighting", "()Ljava/lang/String;", "setAdjustLighting", "(Ljava/lang/String;)V", "getAlignFaceBox", "setAlignFaceBox", "getAlignFaceFrame", "setAlignFaceFrame", "getBackCapture", "setBackCapture", "getBackSideCaptured", "setBackSideCaptured", "getBackToScanning", "setBackToScanning", "getCaptureSuccess", "setCaptureSuccess", "getAlignDocumentId", "setAlignDocumentId", "getAlignDocumentPassport", "setAlignDocumentPassport", "getEnsureIdFocus", "setEnsureIdFocus", "getEnsurePassportFocus", "setEnsurePassportFocus", "getFaceMustBeVisible", "setFaceMustBeVisible", "getFlipIdBarcode", "setFlipIdBarcode", "getFlipYourId", "setFlipYourId", "getFocusCameraId", "setFocusCameraId", "getFocusCameraPassport", "setFocusCameraPassport", "getFrontCapture", "setFrontCapture", "getFrontSideCaptured", "setFrontSideCaptured", "getGreatNowCapture", "setGreatNowCapture", "getHoldDevice", "setHoldDevice", "getHoldPhoneOverId", "setHoldPhoneOverId", "getHoldPhoneOverPassport", "setHoldPhoneOverPassport", "setAllInfoVisible", "setAllInfoVisibleBarcode", "setAllInfoVisiblePassport", "setYourFaceInFrame", "getLookDirectly", "setLookDirectly", "getMakeSureBarcode", "setMakeSureBarcode", "getMoveCloser", "setMoveCloser", "getMovePhoneFront", "setMovePhoneFront", "getOpenPassport", "setOpenPassport", "getPassportCapture", "setPassportCapture", "getPassportCaptured", "setPassportCaptured", "getPlaceFlatAndHoldId", "setPlaceFlatAndHoldId", "getPlaceFlatAndHoldPassport", "setPlaceFlatAndHoldPassport", "getPlaceIdFlat", "setPlaceIdFlat", "getRetake", "setRetake", "getSelfieCapture", "setSelfieCapture", "getSelfieCaptured", "setSelfieCaptured", "getToGetStarted", "setToGetStarted", "getInvalidImage", "setInvalidImage", "getSubmitImageForValidation", "setSubmitImageForValidation", "getValidatingImage", "setValidatingImage", "getImageValidated", "setImageValidated", "getProcessing", "setProcessing", "getSuccess", "setSuccess", "getCameraPermissionMsg", "setCameraPermissionMsg", "getCameraPermissionTitle", "setCameraPermissionTitle", "getCameraPermissionButton", "setCameraPermissionButton", "getBackPressWarningMsg", "setBackPressWarningMsg", "getPreviewDocSubmit", "setPreviewDocSubmit", "getPreviewSelfieSubmit", "setPreviewSelfieSubmit", "getFaceTooClose", "setFaceTooClose", "getPleaseWait", "setPleaseWait", "getMovePhoneBack", "setMovePhoneBack", "getIdTooClose", "setIdTooClose", "getPassportTooClose", "setPassportTooClose", "getFaceNotParallel", "setFaceNotParallel", "getDocSelectSubText", "setDocSelectSubText", "getDocIdSubText", "setDocIdSubText", "getDocPassportSubText", "setDocPassportSubText", "getDocReady", "setDocReady", "getDocCameraPermission", "setDocCameraPermission", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component60", "component61", "component62", "component63", "copy", "equals", "", "other", "hashCode", "", "toString", "capturesdk_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes5.dex */
public final /* data */ class NewLabels {
    public static final int $stable = 8;
    private String adjustLighting;
    private String alignDocumentId;
    private String alignDocumentPassport;
    private String alignFaceBox;
    private String alignFaceFrame;
    private String backCapture;
    private String backPressWarningMsg;
    private String backSideCaptured;
    private String backToScanning;
    private String cameraPermissionButton;
    private String cameraPermissionMsg;
    private String cameraPermissionTitle;
    private String captureSuccess;
    private String docCameraPermission;
    private String docIdSubText;
    private String docPassportSubText;
    private String docReady;
    private String docSelectSubText;
    private String ensureIdFocus;
    private String ensurePassportFocus;
    private String faceMustBeVisible;
    private String faceNotParallel;
    private String faceTooClose;
    private String flipIdBarcode;
    private String flipYourId;
    private String focusCameraId;
    private String focusCameraPassport;
    private String frontCapture;
    private String frontSideCaptured;
    private String greatNowCapture;
    private String holdDevice;
    private String holdPhoneOverId;
    private String holdPhoneOverPassport;
    private String idTooClose;
    private String imageValidated;
    private String invalidImage;
    private String isAllInfoVisible;
    private String isAllInfoVisibleBarcode;
    private String isAllInfoVisiblePassport;
    private String isYourFaceInFrame;
    private String lookDirectly;
    private String makeSureBarcode;
    private String moveCloser;
    private String movePhoneBack;
    private String movePhoneFront;
    private String openPassport;
    private String passportCapture;
    private String passportCaptured;
    private String passportTooClose;
    private String placeFlatAndHoldId;
    private String placeFlatAndHoldPassport;
    private String placeIdFlat;
    private String pleaseWait;
    private String previewDocSubmit;
    private String previewSelfieSubmit;
    private String processing;
    private String retake;
    private String selfieCapture;
    private String selfieCaptured;
    private String submitImageForValidation;
    private String success;
    private String toGetStarted;
    private String validatingImage;

    public NewLabels(@zca(name = "adjustLighting") String str, @zca(name = "alignFaceBox") String str2, @zca(name = "alignFaceFrame") String str3, @zca(name = "backCapture") String str4, @zca(name = "backSideCaptured") String str5, @zca(name = "backToScanning") String str6, @zca(name = "captureSuccess") String str7, @zca(name = "alignDocumentId") String str8, @zca(name = "alignDocumentPassport") String str9, @zca(name = "ensureIdFocus") String str10, @zca(name = "ensurePassportFocus") String str11, @zca(name = "faceMustBeVisible") String str12, @zca(name = "flipIdBarcode") String str13, @zca(name = "flipYourId") String str14, @zca(name = "focusCameraId") String str15, @zca(name = "focusCameraPassport") String str16, @zca(name = "frontCapture") String str17, @zca(name = "frontSideCaptured") String str18, @zca(name = "greatNowCapture") String str19, @zca(name = "holdDevice") String str20, @zca(name = "holdPhoneOverId") String str21, @zca(name = "holdPhoneOverPassport") String str22, @zca(name = "isAllInfoVisible") String str23, @zca(name = "isAllInfoVisibleBarcode") String str24, @zca(name = "isAllInfoVisiblePassport") String str25, @zca(name = "isYourFaceInFrame") String str26, @zca(name = "lookDirectly") String str27, @zca(name = "makeSureBarcode") String str28, @zca(name = "moveCloser") String str29, @zca(name = "movePhoneFront") String str30, @zca(name = "openPassport") String str31, @zca(name = "passportCapture") String str32, @zca(name = "passportCaptured") String str33, @zca(name = "placeFlatAndHoldId") String str34, @zca(name = "placeFlatAndHoldPassport") String str35, @zca(name = "placeIdFlat") String str36, @zca(name = "retake") String str37, @zca(name = "selfieCapture") String str38, @zca(name = "selfieCaptured") String str39, @zca(name = "toGetStarted") String str40, @zca(name = "invalidImage") String str41, @zca(name = "submitImageForValidation") String str42, @zca(name = "validatingImage") String str43, @zca(name = "imageValidated") String str44, @zca(name = "processing") String str45, @zca(name = "success") String str46, @zca(name = "cameraPermissionMsg") String str47, @zca(name = "cameraPermissionTitle") String str48, @zca(name = "cameraPermissionButton") String str49, @zca(name = "backPressWarningMsg") String str50, @zca(name = "previewDocSubmit") String str51, @zca(name = "previewSelfieSubmit") String str52, @zca(name = "faceTooClose") String str53, @zca(name = "pleaseWait") String str54, @zca(name = "movePhoneBack") String str55, @zca(name = "idTooClose") String str56, @zca(name = "passportTooClose") String str57, @zca(name = "faceNotParallel") String str58, @zca(name = "docSelectSubText") String str59, @zca(name = "docIdSubText") String str60, @zca(name = "docPassportSubText") String str61, @zca(name = "docReady") String str62, @zca(name = "docCameraPermission") String str63) {
        k84.p(str, str2, str3, str4, str5);
        k84.p(str6, str7, str8, str9, str10);
        k84.p(str11, str12, str13, str14, str15);
        k84.p(str16, str17, str18, str19, str20);
        k84.p(str21, str22, str23, str24, str25);
        k84.p(str26, str27, str28, str29, str30);
        k84.p(str31, str32, str33, str34, str35);
        k84.p(str36, str37, str38, str39, str40);
        k84.p(str41, str42, str43, str44, str45);
        k84.p(str46, str47, str48, str49, str50);
        k84.p(str51, str52, str53, str54, str55);
        k84.p(str56, str57, str58, str59, str60);
        g.x(str61, str62, str63);
        this.adjustLighting = str;
        this.alignFaceBox = str2;
        this.alignFaceFrame = str3;
        this.backCapture = str4;
        this.backSideCaptured = str5;
        this.backToScanning = str6;
        this.captureSuccess = str7;
        this.alignDocumentId = str8;
        this.alignDocumentPassport = str9;
        this.ensureIdFocus = str10;
        this.ensurePassportFocus = str11;
        this.faceMustBeVisible = str12;
        this.flipIdBarcode = str13;
        this.flipYourId = str14;
        this.focusCameraId = str15;
        this.focusCameraPassport = str16;
        this.frontCapture = str17;
        this.frontSideCaptured = str18;
        this.greatNowCapture = str19;
        this.holdDevice = str20;
        this.holdPhoneOverId = str21;
        this.holdPhoneOverPassport = str22;
        this.isAllInfoVisible = str23;
        this.isAllInfoVisibleBarcode = str24;
        this.isAllInfoVisiblePassport = str25;
        this.isYourFaceInFrame = str26;
        this.lookDirectly = str27;
        this.makeSureBarcode = str28;
        this.moveCloser = str29;
        this.movePhoneFront = str30;
        this.openPassport = str31;
        this.passportCapture = str32;
        this.passportCaptured = str33;
        this.placeFlatAndHoldId = str34;
        this.placeFlatAndHoldPassport = str35;
        this.placeIdFlat = str36;
        this.retake = str37;
        this.selfieCapture = str38;
        this.selfieCaptured = str39;
        this.toGetStarted = str40;
        this.invalidImage = str41;
        this.submitImageForValidation = str42;
        this.validatingImage = str43;
        this.imageValidated = str44;
        this.processing = str45;
        this.success = str46;
        this.cameraPermissionMsg = str47;
        this.cameraPermissionTitle = str48;
        this.cameraPermissionButton = str49;
        this.backPressWarningMsg = str50;
        this.previewDocSubmit = str51;
        this.previewSelfieSubmit = str52;
        this.faceTooClose = str53;
        this.pleaseWait = str54;
        this.movePhoneBack = str55;
        this.idTooClose = str56;
        this.passportTooClose = str57;
        this.faceNotParallel = str58;
        this.docSelectSubText = str59;
        this.docIdSubText = str60;
        this.docPassportSubText = str61;
        this.docReady = str62;
        this.docCameraPermission = str63;
    }

    public static /* synthetic */ NewLabels copy$default(NewLabels newLabels, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, int i, int i2, Object obj) {
        return newLabels.copy((i & 1) != 0 ? newLabels.adjustLighting : str, (i & 2) != 0 ? newLabels.alignFaceBox : str2, (i & 4) != 0 ? newLabels.alignFaceFrame : str3, (i & 8) != 0 ? newLabels.backCapture : str4, (i & 16) != 0 ? newLabels.backSideCaptured : str5, (i & 32) != 0 ? newLabels.backToScanning : str6, (i & 64) != 0 ? newLabels.captureSuccess : str7, (i & 128) != 0 ? newLabels.alignDocumentId : str8, (i & 256) != 0 ? newLabels.alignDocumentPassport : str9, (i & Barcode.FORMAT_UPC_A) != 0 ? newLabels.ensureIdFocus : str10, (i & Barcode.FORMAT_UPC_E) != 0 ? newLabels.ensurePassportFocus : str11, (i & 2048) != 0 ? newLabels.faceMustBeVisible : str12, (i & 4096) != 0 ? newLabels.flipIdBarcode : str13, (i & 8192) != 0 ? newLabels.flipYourId : str14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? newLabels.focusCameraId : str15, (i & 32768) != 0 ? newLabels.focusCameraPassport : str16, (i & 65536) != 0 ? newLabels.frontCapture : str17, (i & 131072) != 0 ? newLabels.frontSideCaptured : str18, (i & 262144) != 0 ? newLabels.greatNowCapture : str19, (i & 524288) != 0 ? newLabels.holdDevice : str20, (i & 1048576) != 0 ? newLabels.holdPhoneOverId : str21, (i & 2097152) != 0 ? newLabels.holdPhoneOverPassport : str22, (i & 4194304) != 0 ? newLabels.isAllInfoVisible : str23, (i & 8388608) != 0 ? newLabels.isAllInfoVisibleBarcode : str24, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newLabels.isAllInfoVisiblePassport : str25, (i & 33554432) != 0 ? newLabels.isYourFaceInFrame : str26, (i & 67108864) != 0 ? newLabels.lookDirectly : str27, (i & 134217728) != 0 ? newLabels.makeSureBarcode : str28, (i & 268435456) != 0 ? newLabels.moveCloser : str29, (i & 536870912) != 0 ? newLabels.movePhoneFront : str30, (i & 1073741824) != 0 ? newLabels.openPassport : str31, (i & Integer.MIN_VALUE) != 0 ? newLabels.passportCapture : str32, (i2 & 1) != 0 ? newLabels.passportCaptured : str33, (i2 & 2) != 0 ? newLabels.placeFlatAndHoldId : str34, (i2 & 4) != 0 ? newLabels.placeFlatAndHoldPassport : str35, (i2 & 8) != 0 ? newLabels.placeIdFlat : str36, (i2 & 16) != 0 ? newLabels.retake : str37, (i2 & 32) != 0 ? newLabels.selfieCapture : str38, (i2 & 64) != 0 ? newLabels.selfieCaptured : str39, (i2 & 128) != 0 ? newLabels.toGetStarted : str40, (i2 & 256) != 0 ? newLabels.invalidImage : str41, (i2 & Barcode.FORMAT_UPC_A) != 0 ? newLabels.submitImageForValidation : str42, (i2 & Barcode.FORMAT_UPC_E) != 0 ? newLabels.validatingImage : str43, (i2 & 2048) != 0 ? newLabels.imageValidated : str44, (i2 & 4096) != 0 ? newLabels.processing : str45, (i2 & 8192) != 0 ? newLabels.success : str46, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? newLabels.cameraPermissionMsg : str47, (i2 & 32768) != 0 ? newLabels.cameraPermissionTitle : str48, (i2 & 65536) != 0 ? newLabels.cameraPermissionButton : str49, (i2 & 131072) != 0 ? newLabels.backPressWarningMsg : str50, (i2 & 262144) != 0 ? newLabels.previewDocSubmit : str51, (i2 & 524288) != 0 ? newLabels.previewSelfieSubmit : str52, (i2 & 1048576) != 0 ? newLabels.faceTooClose : str53, (i2 & 2097152) != 0 ? newLabels.pleaseWait : str54, (i2 & 4194304) != 0 ? newLabels.movePhoneBack : str55, (i2 & 8388608) != 0 ? newLabels.idTooClose : str56, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? newLabels.passportTooClose : str57, (i2 & 33554432) != 0 ? newLabels.faceNotParallel : str58, (i2 & 67108864) != 0 ? newLabels.docSelectSubText : str59, (i2 & 134217728) != 0 ? newLabels.docIdSubText : str60, (i2 & 268435456) != 0 ? newLabels.docPassportSubText : str61, (i2 & 536870912) != 0 ? newLabels.docReady : str62, (i2 & 1073741824) != 0 ? newLabels.docCameraPermission : str63);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    /* renamed from: component11, reason: from getter */
    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    /* renamed from: component12, reason: from getter */
    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    /* renamed from: component13, reason: from getter */
    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFlipYourId() {
        return this.flipYourId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    /* renamed from: component17, reason: from getter */
    public final String getFrontCapture() {
        return this.frontCapture;
    }

    /* renamed from: component18, reason: from getter */
    public final String getFrontSideCaptured() {
        return this.frontSideCaptured;
    }

    /* renamed from: component19, reason: from getter */
    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    /* renamed from: component20, reason: from getter */
    public final String getHoldDevice() {
        return this.holdDevice;
    }

    /* renamed from: component21, reason: from getter */
    public final String getHoldPhoneOverId() {
        return this.holdPhoneOverId;
    }

    /* renamed from: component22, reason: from getter */
    public final String getHoldPhoneOverPassport() {
        return this.holdPhoneOverPassport;
    }

    /* renamed from: component23, reason: from getter */
    public final String getIsAllInfoVisible() {
        return this.isAllInfoVisible;
    }

    /* renamed from: component24, reason: from getter */
    public final String getIsAllInfoVisibleBarcode() {
        return this.isAllInfoVisibleBarcode;
    }

    /* renamed from: component25, reason: from getter */
    public final String getIsAllInfoVisiblePassport() {
        return this.isAllInfoVisiblePassport;
    }

    /* renamed from: component26, reason: from getter */
    public final String getIsYourFaceInFrame() {
        return this.isYourFaceInFrame;
    }

    /* renamed from: component27, reason: from getter */
    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    /* renamed from: component28, reason: from getter */
    public final String getMakeSureBarcode() {
        return this.makeSureBarcode;
    }

    /* renamed from: component29, reason: from getter */
    public final String getMoveCloser() {
        return this.moveCloser;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    /* renamed from: component30, reason: from getter */
    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    /* renamed from: component31, reason: from getter */
    public final String getOpenPassport() {
        return this.openPassport;
    }

    /* renamed from: component32, reason: from getter */
    public final String getPassportCapture() {
        return this.passportCapture;
    }

    /* renamed from: component33, reason: from getter */
    public final String getPassportCaptured() {
        return this.passportCaptured;
    }

    /* renamed from: component34, reason: from getter */
    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    /* renamed from: component35, reason: from getter */
    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    /* renamed from: component36, reason: from getter */
    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    /* renamed from: component37, reason: from getter */
    public final String getRetake() {
        return this.retake;
    }

    /* renamed from: component38, reason: from getter */
    public final String getSelfieCapture() {
        return this.selfieCapture;
    }

    /* renamed from: component39, reason: from getter */
    public final String getSelfieCaptured() {
        return this.selfieCaptured;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackCapture() {
        return this.backCapture;
    }

    /* renamed from: component40, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    /* renamed from: component41, reason: from getter */
    public final String getInvalidImage() {
        return this.invalidImage;
    }

    /* renamed from: component42, reason: from getter */
    public final String getSubmitImageForValidation() {
        return this.submitImageForValidation;
    }

    /* renamed from: component43, reason: from getter */
    public final String getValidatingImage() {
        return this.validatingImage;
    }

    /* renamed from: component44, reason: from getter */
    public final String getImageValidated() {
        return this.imageValidated;
    }

    /* renamed from: component45, reason: from getter */
    public final String getProcessing() {
        return this.processing;
    }

    /* renamed from: component46, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    /* renamed from: component47, reason: from getter */
    public final String getCameraPermissionMsg() {
        return this.cameraPermissionMsg;
    }

    /* renamed from: component48, reason: from getter */
    public final String getCameraPermissionTitle() {
        return this.cameraPermissionTitle;
    }

    /* renamed from: component49, reason: from getter */
    public final String getCameraPermissionButton() {
        return this.cameraPermissionButton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackSideCaptured() {
        return this.backSideCaptured;
    }

    /* renamed from: component50, reason: from getter */
    public final String getBackPressWarningMsg() {
        return this.backPressWarningMsg;
    }

    /* renamed from: component51, reason: from getter */
    public final String getPreviewDocSubmit() {
        return this.previewDocSubmit;
    }

    /* renamed from: component52, reason: from getter */
    public final String getPreviewSelfieSubmit() {
        return this.previewSelfieSubmit;
    }

    /* renamed from: component53, reason: from getter */
    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    /* renamed from: component54, reason: from getter */
    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    /* renamed from: component55, reason: from getter */
    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    /* renamed from: component56, reason: from getter */
    public final String getIdTooClose() {
        return this.idTooClose;
    }

    /* renamed from: component57, reason: from getter */
    public final String getPassportTooClose() {
        return this.passportTooClose;
    }

    /* renamed from: component58, reason: from getter */
    public final String getFaceNotParallel() {
        return this.faceNotParallel;
    }

    /* renamed from: component59, reason: from getter */
    public final String getDocSelectSubText() {
        return this.docSelectSubText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component60, reason: from getter */
    public final String getDocIdSubText() {
        return this.docIdSubText;
    }

    /* renamed from: component61, reason: from getter */
    public final String getDocPassportSubText() {
        return this.docPassportSubText;
    }

    /* renamed from: component62, reason: from getter */
    public final String getDocReady() {
        return this.docReady;
    }

    /* renamed from: component63, reason: from getter */
    public final String getDocCameraPermission() {
        return this.docCameraPermission;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAlignDocumentId() {
        return this.alignDocumentId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAlignDocumentPassport() {
        return this.alignDocumentPassport;
    }

    public final NewLabels copy(@zca(name = "adjustLighting") String adjustLighting, @zca(name = "alignFaceBox") String alignFaceBox, @zca(name = "alignFaceFrame") String alignFaceFrame, @zca(name = "backCapture") String backCapture, @zca(name = "backSideCaptured") String backSideCaptured, @zca(name = "backToScanning") String backToScanning, @zca(name = "captureSuccess") String captureSuccess, @zca(name = "alignDocumentId") String alignDocumentId, @zca(name = "alignDocumentPassport") String alignDocumentPassport, @zca(name = "ensureIdFocus") String ensureIdFocus, @zca(name = "ensurePassportFocus") String ensurePassportFocus, @zca(name = "faceMustBeVisible") String faceMustBeVisible, @zca(name = "flipIdBarcode") String flipIdBarcode, @zca(name = "flipYourId") String flipYourId, @zca(name = "focusCameraId") String focusCameraId, @zca(name = "focusCameraPassport") String focusCameraPassport, @zca(name = "frontCapture") String frontCapture, @zca(name = "frontSideCaptured") String frontSideCaptured, @zca(name = "greatNowCapture") String greatNowCapture, @zca(name = "holdDevice") String holdDevice, @zca(name = "holdPhoneOverId") String holdPhoneOverId, @zca(name = "holdPhoneOverPassport") String holdPhoneOverPassport, @zca(name = "isAllInfoVisible") String isAllInfoVisible, @zca(name = "isAllInfoVisibleBarcode") String isAllInfoVisibleBarcode, @zca(name = "isAllInfoVisiblePassport") String isAllInfoVisiblePassport, @zca(name = "isYourFaceInFrame") String isYourFaceInFrame, @zca(name = "lookDirectly") String lookDirectly, @zca(name = "makeSureBarcode") String makeSureBarcode, @zca(name = "moveCloser") String moveCloser, @zca(name = "movePhoneFront") String movePhoneFront, @zca(name = "openPassport") String openPassport, @zca(name = "passportCapture") String passportCapture, @zca(name = "passportCaptured") String passportCaptured, @zca(name = "placeFlatAndHoldId") String placeFlatAndHoldId, @zca(name = "placeFlatAndHoldPassport") String placeFlatAndHoldPassport, @zca(name = "placeIdFlat") String placeIdFlat, @zca(name = "retake") String retake, @zca(name = "selfieCapture") String selfieCapture, @zca(name = "selfieCaptured") String selfieCaptured, @zca(name = "toGetStarted") String toGetStarted, @zca(name = "invalidImage") String invalidImage, @zca(name = "submitImageForValidation") String submitImageForValidation, @zca(name = "validatingImage") String validatingImage, @zca(name = "imageValidated") String imageValidated, @zca(name = "processing") String processing, @zca(name = "success") String success, @zca(name = "cameraPermissionMsg") String cameraPermissionMsg, @zca(name = "cameraPermissionTitle") String cameraPermissionTitle, @zca(name = "cameraPermissionButton") String cameraPermissionButton, @zca(name = "backPressWarningMsg") String backPressWarningMsg, @zca(name = "previewDocSubmit") String previewDocSubmit, @zca(name = "previewSelfieSubmit") String previewSelfieSubmit, @zca(name = "faceTooClose") String faceTooClose, @zca(name = "pleaseWait") String pleaseWait, @zca(name = "movePhoneBack") String movePhoneBack, @zca(name = "idTooClose") String idTooClose, @zca(name = "passportTooClose") String passportTooClose, @zca(name = "faceNotParallel") String faceNotParallel, @zca(name = "docSelectSubText") String docSelectSubText, @zca(name = "docIdSubText") String docIdSubText, @zca(name = "docPassportSubText") String docPassportSubText, @zca(name = "docReady") String docReady, @zca(name = "docCameraPermission") String docCameraPermission) {
        k84.p(adjustLighting, alignFaceBox, alignFaceFrame, backCapture, backSideCaptured);
        k84.p(backToScanning, captureSuccess, alignDocumentId, alignDocumentPassport, ensureIdFocus);
        k84.p(ensurePassportFocus, faceMustBeVisible, flipIdBarcode, flipYourId, focusCameraId);
        k84.p(focusCameraPassport, frontCapture, frontSideCaptured, greatNowCapture, holdDevice);
        k84.p(holdPhoneOverId, holdPhoneOverPassport, isAllInfoVisible, isAllInfoVisibleBarcode, isAllInfoVisiblePassport);
        k84.p(isYourFaceInFrame, lookDirectly, makeSureBarcode, moveCloser, movePhoneFront);
        k84.p(openPassport, passportCapture, passportCaptured, placeFlatAndHoldId, placeFlatAndHoldPassport);
        k84.p(placeIdFlat, retake, selfieCapture, selfieCaptured, toGetStarted);
        k84.p(invalidImage, submitImageForValidation, validatingImage, imageValidated, processing);
        k84.p(success, cameraPermissionMsg, cameraPermissionTitle, cameraPermissionButton, backPressWarningMsg);
        k84.p(previewDocSubmit, previewSelfieSubmit, faceTooClose, pleaseWait, movePhoneBack);
        k84.p(idTooClose, passportTooClose, faceNotParallel, docSelectSubText, docIdSubText);
        docPassportSubText.getClass();
        docReady.getClass();
        docCameraPermission.getClass();
        return new NewLabels(adjustLighting, alignFaceBox, alignFaceFrame, backCapture, backSideCaptured, backToScanning, captureSuccess, alignDocumentId, alignDocumentPassport, ensureIdFocus, ensurePassportFocus, faceMustBeVisible, flipIdBarcode, flipYourId, focusCameraId, focusCameraPassport, frontCapture, frontSideCaptured, greatNowCapture, holdDevice, holdPhoneOverId, holdPhoneOverPassport, isAllInfoVisible, isAllInfoVisibleBarcode, isAllInfoVisiblePassport, isYourFaceInFrame, lookDirectly, makeSureBarcode, moveCloser, movePhoneFront, openPassport, passportCapture, passportCaptured, placeFlatAndHoldId, placeFlatAndHoldPassport, placeIdFlat, retake, selfieCapture, selfieCaptured, toGetStarted, invalidImage, submitImageForValidation, validatingImage, imageValidated, processing, success, cameraPermissionMsg, cameraPermissionTitle, cameraPermissionButton, backPressWarningMsg, previewDocSubmit, previewSelfieSubmit, faceTooClose, pleaseWait, movePhoneBack, idTooClose, passportTooClose, faceNotParallel, docSelectSubText, docIdSubText, docPassportSubText, docReady, docCameraPermission);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewLabels)) {
            return false;
        }
        NewLabels newLabels = (NewLabels) other;
        if (Intrinsics.areEqual(this.adjustLighting, newLabels.adjustLighting) && Intrinsics.areEqual(this.alignFaceBox, newLabels.alignFaceBox) && Intrinsics.areEqual(this.alignFaceFrame, newLabels.alignFaceFrame) && Intrinsics.areEqual(this.backCapture, newLabels.backCapture) && Intrinsics.areEqual(this.backSideCaptured, newLabels.backSideCaptured) && Intrinsics.areEqual(this.backToScanning, newLabels.backToScanning) && Intrinsics.areEqual(this.captureSuccess, newLabels.captureSuccess) && Intrinsics.areEqual(this.alignDocumentId, newLabels.alignDocumentId) && Intrinsics.areEqual(this.alignDocumentPassport, newLabels.alignDocumentPassport) && Intrinsics.areEqual(this.ensureIdFocus, newLabels.ensureIdFocus) && Intrinsics.areEqual(this.ensurePassportFocus, newLabels.ensurePassportFocus) && Intrinsics.areEqual(this.faceMustBeVisible, newLabels.faceMustBeVisible) && Intrinsics.areEqual(this.flipIdBarcode, newLabels.flipIdBarcode) && Intrinsics.areEqual(this.flipYourId, newLabels.flipYourId) && Intrinsics.areEqual(this.focusCameraId, newLabels.focusCameraId) && Intrinsics.areEqual(this.focusCameraPassport, newLabels.focusCameraPassport) && Intrinsics.areEqual(this.frontCapture, newLabels.frontCapture) && Intrinsics.areEqual(this.frontSideCaptured, newLabels.frontSideCaptured) && Intrinsics.areEqual(this.greatNowCapture, newLabels.greatNowCapture) && Intrinsics.areEqual(this.holdDevice, newLabels.holdDevice) && Intrinsics.areEqual(this.holdPhoneOverId, newLabels.holdPhoneOverId) && Intrinsics.areEqual(this.holdPhoneOverPassport, newLabels.holdPhoneOverPassport) && Intrinsics.areEqual(this.isAllInfoVisible, newLabels.isAllInfoVisible) && Intrinsics.areEqual(this.isAllInfoVisibleBarcode, newLabels.isAllInfoVisibleBarcode) && Intrinsics.areEqual(this.isAllInfoVisiblePassport, newLabels.isAllInfoVisiblePassport) && Intrinsics.areEqual(this.isYourFaceInFrame, newLabels.isYourFaceInFrame) && Intrinsics.areEqual(this.lookDirectly, newLabels.lookDirectly) && Intrinsics.areEqual(this.makeSureBarcode, newLabels.makeSureBarcode) && Intrinsics.areEqual(this.moveCloser, newLabels.moveCloser) && Intrinsics.areEqual(this.movePhoneFront, newLabels.movePhoneFront) && Intrinsics.areEqual(this.openPassport, newLabels.openPassport) && Intrinsics.areEqual(this.passportCapture, newLabels.passportCapture) && Intrinsics.areEqual(this.passportCaptured, newLabels.passportCaptured) && Intrinsics.areEqual(this.placeFlatAndHoldId, newLabels.placeFlatAndHoldId) && Intrinsics.areEqual(this.placeFlatAndHoldPassport, newLabels.placeFlatAndHoldPassport) && Intrinsics.areEqual(this.placeIdFlat, newLabels.placeIdFlat) && Intrinsics.areEqual(this.retake, newLabels.retake) && Intrinsics.areEqual(this.selfieCapture, newLabels.selfieCapture) && Intrinsics.areEqual(this.selfieCaptured, newLabels.selfieCaptured) && Intrinsics.areEqual(this.toGetStarted, newLabels.toGetStarted) && Intrinsics.areEqual(this.invalidImage, newLabels.invalidImage) && Intrinsics.areEqual(this.submitImageForValidation, newLabels.submitImageForValidation) && Intrinsics.areEqual(this.validatingImage, newLabels.validatingImage) && Intrinsics.areEqual(this.imageValidated, newLabels.imageValidated) && Intrinsics.areEqual(this.processing, newLabels.processing) && Intrinsics.areEqual(this.success, newLabels.success) && Intrinsics.areEqual(this.cameraPermissionMsg, newLabels.cameraPermissionMsg) && Intrinsics.areEqual(this.cameraPermissionTitle, newLabels.cameraPermissionTitle) && Intrinsics.areEqual(this.cameraPermissionButton, newLabels.cameraPermissionButton) && Intrinsics.areEqual(this.backPressWarningMsg, newLabels.backPressWarningMsg) && Intrinsics.areEqual(this.previewDocSubmit, newLabels.previewDocSubmit) && Intrinsics.areEqual(this.previewSelfieSubmit, newLabels.previewSelfieSubmit) && Intrinsics.areEqual(this.faceTooClose, newLabels.faceTooClose) && Intrinsics.areEqual(this.pleaseWait, newLabels.pleaseWait) && Intrinsics.areEqual(this.movePhoneBack, newLabels.movePhoneBack) && Intrinsics.areEqual(this.idTooClose, newLabels.idTooClose) && Intrinsics.areEqual(this.passportTooClose, newLabels.passportTooClose) && Intrinsics.areEqual(this.faceNotParallel, newLabels.faceNotParallel) && Intrinsics.areEqual(this.docSelectSubText, newLabels.docSelectSubText) && Intrinsics.areEqual(this.docIdSubText, newLabels.docIdSubText) && Intrinsics.areEqual(this.docPassportSubText, newLabels.docPassportSubText) && Intrinsics.areEqual(this.docReady, newLabels.docReady) && Intrinsics.areEqual(this.docCameraPermission, newLabels.docCameraPermission)) {
            return true;
        }
        return false;
    }

    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    public final String getAlignDocumentId() {
        return this.alignDocumentId;
    }

    public final String getAlignDocumentPassport() {
        return this.alignDocumentPassport;
    }

    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    public final String getBackCapture() {
        return this.backCapture;
    }

    public final String getBackPressWarningMsg() {
        return this.backPressWarningMsg;
    }

    public final String getBackSideCaptured() {
        return this.backSideCaptured;
    }

    public final String getBackToScanning() {
        return this.backToScanning;
    }

    public final String getCameraPermissionButton() {
        return this.cameraPermissionButton;
    }

    public final String getCameraPermissionMsg() {
        return this.cameraPermissionMsg;
    }

    public final String getCameraPermissionTitle() {
        return this.cameraPermissionTitle;
    }

    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    public final String getDocCameraPermission() {
        return this.docCameraPermission;
    }

    public final String getDocIdSubText() {
        return this.docIdSubText;
    }

    public final String getDocPassportSubText() {
        return this.docPassportSubText;
    }

    public final String getDocReady() {
        return this.docReady;
    }

    public final String getDocSelectSubText() {
        return this.docSelectSubText;
    }

    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    public final String getFaceNotParallel() {
        return this.faceNotParallel;
    }

    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    public final String getFlipYourId() {
        return this.flipYourId;
    }

    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    public final String getFrontCapture() {
        return this.frontCapture;
    }

    public final String getFrontSideCaptured() {
        return this.frontSideCaptured;
    }

    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    public final String getHoldDevice() {
        return this.holdDevice;
    }

    public final String getHoldPhoneOverId() {
        return this.holdPhoneOverId;
    }

    public final String getHoldPhoneOverPassport() {
        return this.holdPhoneOverPassport;
    }

    public final String getIdTooClose() {
        return this.idTooClose;
    }

    public final String getImageValidated() {
        return this.imageValidated;
    }

    public final String getInvalidImage() {
        return this.invalidImage;
    }

    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    public final String getMakeSureBarcode() {
        return this.makeSureBarcode;
    }

    public final String getMoveCloser() {
        return this.moveCloser;
    }

    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    public final String getOpenPassport() {
        return this.openPassport;
    }

    public final String getPassportCapture() {
        return this.passportCapture;
    }

    public final String getPassportCaptured() {
        return this.passportCaptured;
    }

    public final String getPassportTooClose() {
        return this.passportTooClose;
    }

    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    public final String getPreviewDocSubmit() {
        return this.previewDocSubmit;
    }

    public final String getPreviewSelfieSubmit() {
        return this.previewSelfieSubmit;
    }

    public final String getProcessing() {
        return this.processing;
    }

    public final String getRetake() {
        return this.retake;
    }

    public final String getSelfieCapture() {
        return this.selfieCapture;
    }

    public final String getSelfieCaptured() {
        return this.selfieCaptured;
    }

    public final String getSubmitImageForValidation() {
        return this.submitImageForValidation;
    }

    public final String getSuccess() {
        return this.success;
    }

    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    public final String getValidatingImage() {
        return this.validatingImage;
    }

    public int hashCode() {
        return this.docCameraPermission.hashCode() + com.socure.docv.capturesdk.api.a.a(this.docReady, com.socure.docv.capturesdk.api.a.a(this.docPassportSubText, com.socure.docv.capturesdk.api.a.a(this.docIdSubText, com.socure.docv.capturesdk.api.a.a(this.docSelectSubText, com.socure.docv.capturesdk.api.a.a(this.faceNotParallel, com.socure.docv.capturesdk.api.a.a(this.passportTooClose, com.socure.docv.capturesdk.api.a.a(this.idTooClose, com.socure.docv.capturesdk.api.a.a(this.movePhoneBack, com.socure.docv.capturesdk.api.a.a(this.pleaseWait, com.socure.docv.capturesdk.api.a.a(this.faceTooClose, com.socure.docv.capturesdk.api.a.a(this.previewSelfieSubmit, com.socure.docv.capturesdk.api.a.a(this.previewDocSubmit, com.socure.docv.capturesdk.api.a.a(this.backPressWarningMsg, com.socure.docv.capturesdk.api.a.a(this.cameraPermissionButton, com.socure.docv.capturesdk.api.a.a(this.cameraPermissionTitle, com.socure.docv.capturesdk.api.a.a(this.cameraPermissionMsg, com.socure.docv.capturesdk.api.a.a(this.success, com.socure.docv.capturesdk.api.a.a(this.processing, com.socure.docv.capturesdk.api.a.a(this.imageValidated, com.socure.docv.capturesdk.api.a.a(this.validatingImage, com.socure.docv.capturesdk.api.a.a(this.submitImageForValidation, com.socure.docv.capturesdk.api.a.a(this.invalidImage, com.socure.docv.capturesdk.api.a.a(this.toGetStarted, com.socure.docv.capturesdk.api.a.a(this.selfieCaptured, com.socure.docv.capturesdk.api.a.a(this.selfieCapture, com.socure.docv.capturesdk.api.a.a(this.retake, com.socure.docv.capturesdk.api.a.a(this.placeIdFlat, com.socure.docv.capturesdk.api.a.a(this.placeFlatAndHoldPassport, com.socure.docv.capturesdk.api.a.a(this.placeFlatAndHoldId, com.socure.docv.capturesdk.api.a.a(this.passportCaptured, com.socure.docv.capturesdk.api.a.a(this.passportCapture, com.socure.docv.capturesdk.api.a.a(this.openPassport, com.socure.docv.capturesdk.api.a.a(this.movePhoneFront, com.socure.docv.capturesdk.api.a.a(this.moveCloser, com.socure.docv.capturesdk.api.a.a(this.makeSureBarcode, com.socure.docv.capturesdk.api.a.a(this.lookDirectly, com.socure.docv.capturesdk.api.a.a(this.isYourFaceInFrame, com.socure.docv.capturesdk.api.a.a(this.isAllInfoVisiblePassport, com.socure.docv.capturesdk.api.a.a(this.isAllInfoVisibleBarcode, com.socure.docv.capturesdk.api.a.a(this.isAllInfoVisible, com.socure.docv.capturesdk.api.a.a(this.holdPhoneOverPassport, com.socure.docv.capturesdk.api.a.a(this.holdPhoneOverId, com.socure.docv.capturesdk.api.a.a(this.holdDevice, com.socure.docv.capturesdk.api.a.a(this.greatNowCapture, com.socure.docv.capturesdk.api.a.a(this.frontSideCaptured, com.socure.docv.capturesdk.api.a.a(this.frontCapture, com.socure.docv.capturesdk.api.a.a(this.focusCameraPassport, com.socure.docv.capturesdk.api.a.a(this.focusCameraId, com.socure.docv.capturesdk.api.a.a(this.flipYourId, com.socure.docv.capturesdk.api.a.a(this.flipIdBarcode, com.socure.docv.capturesdk.api.a.a(this.faceMustBeVisible, com.socure.docv.capturesdk.api.a.a(this.ensurePassportFocus, com.socure.docv.capturesdk.api.a.a(this.ensureIdFocus, com.socure.docv.capturesdk.api.a.a(this.alignDocumentPassport, com.socure.docv.capturesdk.api.a.a(this.alignDocumentId, com.socure.docv.capturesdk.api.a.a(this.captureSuccess, com.socure.docv.capturesdk.api.a.a(this.backToScanning, com.socure.docv.capturesdk.api.a.a(this.backSideCaptured, com.socure.docv.capturesdk.api.a.a(this.backCapture, com.socure.docv.capturesdk.api.a.a(this.alignFaceFrame, com.socure.docv.capturesdk.api.a.a(this.alignFaceBox, this.adjustLighting.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String isAllInfoVisible() {
        return this.isAllInfoVisible;
    }

    public final String isAllInfoVisibleBarcode() {
        return this.isAllInfoVisibleBarcode;
    }

    public final String isAllInfoVisiblePassport() {
        return this.isAllInfoVisiblePassport;
    }

    public final String isYourFaceInFrame() {
        return this.isYourFaceInFrame;
    }

    public final void setAdjustLighting(String str) {
        str.getClass();
        this.adjustLighting = str;
    }

    public final void setAlignDocumentId(String str) {
        str.getClass();
        this.alignDocumentId = str;
    }

    public final void setAlignDocumentPassport(String str) {
        str.getClass();
        this.alignDocumentPassport = str;
    }

    public final void setAlignFaceBox(String str) {
        str.getClass();
        this.alignFaceBox = str;
    }

    public final void setAlignFaceFrame(String str) {
        str.getClass();
        this.alignFaceFrame = str;
    }

    public final void setAllInfoVisible(String str) {
        str.getClass();
        this.isAllInfoVisible = str;
    }

    public final void setAllInfoVisibleBarcode(String str) {
        str.getClass();
        this.isAllInfoVisibleBarcode = str;
    }

    public final void setAllInfoVisiblePassport(String str) {
        str.getClass();
        this.isAllInfoVisiblePassport = str;
    }

    public final void setBackCapture(String str) {
        str.getClass();
        this.backCapture = str;
    }

    public final void setBackPressWarningMsg(String str) {
        str.getClass();
        this.backPressWarningMsg = str;
    }

    public final void setBackSideCaptured(String str) {
        str.getClass();
        this.backSideCaptured = str;
    }

    public final void setBackToScanning(String str) {
        str.getClass();
        this.backToScanning = str;
    }

    public final void setCameraPermissionButton(String str) {
        str.getClass();
        this.cameraPermissionButton = str;
    }

    public final void setCameraPermissionMsg(String str) {
        str.getClass();
        this.cameraPermissionMsg = str;
    }

    public final void setCameraPermissionTitle(String str) {
        str.getClass();
        this.cameraPermissionTitle = str;
    }

    public final void setCaptureSuccess(String str) {
        str.getClass();
        this.captureSuccess = str;
    }

    public final void setDocCameraPermission(String str) {
        str.getClass();
        this.docCameraPermission = str;
    }

    public final void setDocIdSubText(String str) {
        str.getClass();
        this.docIdSubText = str;
    }

    public final void setDocPassportSubText(String str) {
        str.getClass();
        this.docPassportSubText = str;
    }

    public final void setDocReady(String str) {
        str.getClass();
        this.docReady = str;
    }

    public final void setDocSelectSubText(String str) {
        str.getClass();
        this.docSelectSubText = str;
    }

    public final void setEnsureIdFocus(String str) {
        str.getClass();
        this.ensureIdFocus = str;
    }

    public final void setEnsurePassportFocus(String str) {
        str.getClass();
        this.ensurePassportFocus = str;
    }

    public final void setFaceMustBeVisible(String str) {
        str.getClass();
        this.faceMustBeVisible = str;
    }

    public final void setFaceNotParallel(String str) {
        str.getClass();
        this.faceNotParallel = str;
    }

    public final void setFaceTooClose(String str) {
        str.getClass();
        this.faceTooClose = str;
    }

    public final void setFlipIdBarcode(String str) {
        str.getClass();
        this.flipIdBarcode = str;
    }

    public final void setFlipYourId(String str) {
        str.getClass();
        this.flipYourId = str;
    }

    public final void setFocusCameraId(String str) {
        str.getClass();
        this.focusCameraId = str;
    }

    public final void setFocusCameraPassport(String str) {
        str.getClass();
        this.focusCameraPassport = str;
    }

    public final void setFrontCapture(String str) {
        str.getClass();
        this.frontCapture = str;
    }

    public final void setFrontSideCaptured(String str) {
        str.getClass();
        this.frontSideCaptured = str;
    }

    public final void setGreatNowCapture(String str) {
        str.getClass();
        this.greatNowCapture = str;
    }

    public final void setHoldDevice(String str) {
        str.getClass();
        this.holdDevice = str;
    }

    public final void setHoldPhoneOverId(String str) {
        str.getClass();
        this.holdPhoneOverId = str;
    }

    public final void setHoldPhoneOverPassport(String str) {
        str.getClass();
        this.holdPhoneOverPassport = str;
    }

    public final void setIdTooClose(String str) {
        str.getClass();
        this.idTooClose = str;
    }

    public final void setImageValidated(String str) {
        str.getClass();
        this.imageValidated = str;
    }

    public final void setInvalidImage(String str) {
        str.getClass();
        this.invalidImage = str;
    }

    public final void setLookDirectly(String str) {
        str.getClass();
        this.lookDirectly = str;
    }

    public final void setMakeSureBarcode(String str) {
        str.getClass();
        this.makeSureBarcode = str;
    }

    public final void setMoveCloser(String str) {
        str.getClass();
        this.moveCloser = str;
    }

    public final void setMovePhoneBack(String str) {
        str.getClass();
        this.movePhoneBack = str;
    }

    public final void setMovePhoneFront(String str) {
        str.getClass();
        this.movePhoneFront = str;
    }

    public final void setOpenPassport(String str) {
        str.getClass();
        this.openPassport = str;
    }

    public final void setPassportCapture(String str) {
        str.getClass();
        this.passportCapture = str;
    }

    public final void setPassportCaptured(String str) {
        str.getClass();
        this.passportCaptured = str;
    }

    public final void setPassportTooClose(String str) {
        str.getClass();
        this.passportTooClose = str;
    }

    public final void setPlaceFlatAndHoldId(String str) {
        str.getClass();
        this.placeFlatAndHoldId = str;
    }

    public final void setPlaceFlatAndHoldPassport(String str) {
        str.getClass();
        this.placeFlatAndHoldPassport = str;
    }

    public final void setPlaceIdFlat(String str) {
        str.getClass();
        this.placeIdFlat = str;
    }

    public final void setPleaseWait(String str) {
        str.getClass();
        this.pleaseWait = str;
    }

    public final void setPreviewDocSubmit(String str) {
        str.getClass();
        this.previewDocSubmit = str;
    }

    public final void setPreviewSelfieSubmit(String str) {
        str.getClass();
        this.previewSelfieSubmit = str;
    }

    public final void setProcessing(String str) {
        str.getClass();
        this.processing = str;
    }

    public final void setRetake(String str) {
        str.getClass();
        this.retake = str;
    }

    public final void setSelfieCapture(String str) {
        str.getClass();
        this.selfieCapture = str;
    }

    public final void setSelfieCaptured(String str) {
        str.getClass();
        this.selfieCaptured = str;
    }

    public final void setSubmitImageForValidation(String str) {
        str.getClass();
        this.submitImageForValidation = str;
    }

    public final void setSuccess(String str) {
        str.getClass();
        this.success = str;
    }

    public final void setToGetStarted(String str) {
        str.getClass();
        this.toGetStarted = str;
    }

    public final void setValidatingImage(String str) {
        str.getClass();
        this.validatingImage = str;
    }

    public final void setYourFaceInFrame(String str) {
        str.getClass();
        this.isYourFaceInFrame = str;
    }

    public String toString() {
        String str = this.adjustLighting;
        String str2 = this.alignFaceBox;
        String str3 = this.alignFaceFrame;
        String str4 = this.backCapture;
        String str5 = this.backSideCaptured;
        String str6 = this.backToScanning;
        String str7 = this.captureSuccess;
        String str8 = this.alignDocumentId;
        String str9 = this.alignDocumentPassport;
        String str10 = this.ensureIdFocus;
        String str11 = this.ensurePassportFocus;
        String str12 = this.faceMustBeVisible;
        String str13 = this.flipIdBarcode;
        String str14 = this.flipYourId;
        String str15 = this.focusCameraId;
        String str16 = this.focusCameraPassport;
        String str17 = this.frontCapture;
        String str18 = this.frontSideCaptured;
        String str19 = this.greatNowCapture;
        String str20 = this.holdDevice;
        String str21 = this.holdPhoneOverId;
        String str22 = this.holdPhoneOverPassport;
        String str23 = this.isAllInfoVisible;
        String str24 = this.isAllInfoVisibleBarcode;
        String str25 = this.isAllInfoVisiblePassport;
        String str26 = this.isYourFaceInFrame;
        String str27 = this.lookDirectly;
        String str28 = this.makeSureBarcode;
        String str29 = this.moveCloser;
        String str30 = this.movePhoneFront;
        String str31 = this.openPassport;
        String str32 = this.passportCapture;
        String str33 = this.passportCaptured;
        String str34 = this.placeFlatAndHoldId;
        String str35 = this.placeFlatAndHoldPassport;
        String str36 = this.placeIdFlat;
        String str37 = this.retake;
        String str38 = this.selfieCapture;
        String str39 = this.selfieCaptured;
        String str40 = this.toGetStarted;
        String str41 = this.invalidImage;
        String str42 = this.submitImageForValidation;
        String str43 = this.validatingImage;
        String str44 = this.imageValidated;
        String str45 = this.processing;
        String str46 = this.success;
        String str47 = this.cameraPermissionMsg;
        String str48 = this.cameraPermissionTitle;
        String str49 = this.cameraPermissionButton;
        String str50 = this.backPressWarningMsg;
        String str51 = this.previewDocSubmit;
        String str52 = this.previewSelfieSubmit;
        String str53 = this.faceTooClose;
        String str54 = this.pleaseWait;
        String str55 = this.movePhoneBack;
        String str56 = this.idTooClose;
        String str57 = this.passportTooClose;
        String str58 = this.faceNotParallel;
        String str59 = this.docSelectSubText;
        String str60 = this.docIdSubText;
        String str61 = this.docPassportSubText;
        String str62 = this.docReady;
        String str63 = this.docCameraPermission;
        StringBuilder r = m51.r("NewLabels(adjustLighting=", str, ", alignFaceBox=", str2, ", alignFaceFrame=");
        k84.q(r, str3, ", backCapture=", str4, ", backSideCaptured=");
        k84.q(r, str5, ", backToScanning=", str6, ", captureSuccess=");
        k84.q(r, str7, ", alignDocumentId=", str8, ", alignDocumentPassport=");
        k84.q(r, str9, ", ensureIdFocus=", str10, ", ensurePassportFocus=");
        k84.q(r, str11, ", faceMustBeVisible=", str12, ", flipIdBarcode=");
        k84.q(r, str13, ", flipYourId=", str14, ", focusCameraId=");
        k84.q(r, str15, ", focusCameraPassport=", str16, ", frontCapture=");
        k84.q(r, str17, ", frontSideCaptured=", str18, ", greatNowCapture=");
        k84.q(r, str19, ", holdDevice=", str20, ", holdPhoneOverId=");
        k84.q(r, str21, ", holdPhoneOverPassport=", str22, ", isAllInfoVisible=");
        k84.q(r, str23, ", isAllInfoVisibleBarcode=", str24, ", isAllInfoVisiblePassport=");
        k84.q(r, str25, ", isYourFaceInFrame=", str26, ", lookDirectly=");
        k84.q(r, str27, ", makeSureBarcode=", str28, ", moveCloser=");
        k84.q(r, str29, ", movePhoneFront=", str30, ", openPassport=");
        k84.q(r, str31, ", passportCapture=", str32, ", passportCaptured=");
        k84.q(r, str33, ", placeFlatAndHoldId=", str34, ", placeFlatAndHoldPassport=");
        k84.q(r, str35, ", placeIdFlat=", str36, ", retake=");
        k84.q(r, str37, ", selfieCapture=", str38, ", selfieCaptured=");
        k84.q(r, str39, ", toGetStarted=", str40, ", invalidImage=");
        k84.q(r, str41, ", submitImageForValidation=", str42, ", validatingImage=");
        k84.q(r, str43, ", imageValidated=", str44, ", processing=");
        k84.q(r, str45, ", success=", str46, ", cameraPermissionMsg=");
        k84.q(r, str47, ", cameraPermissionTitle=", str48, ", cameraPermissionButton=");
        k84.q(r, str49, ", backPressWarningMsg=", str50, ", previewDocSubmit=");
        k84.q(r, str51, ", previewSelfieSubmit=", str52, ", faceTooClose=");
        k84.q(r, str53, ", pleaseWait=", str54, ", movePhoneBack=");
        k84.q(r, str55, ", idTooClose=", str56, ", passportTooClose=");
        k84.q(r, str57, ", faceNotParallel=", str58, ", docSelectSubText=");
        k84.q(r, str59, ", docIdSubText=", str60, ", docPassportSubText=");
        k84.q(r, str61, ", docReady=", str62, ", docCameraPermission=");
        return woa.r(r, str63, ")");
    }
}
