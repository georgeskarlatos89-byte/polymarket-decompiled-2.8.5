package com.google.mlkit.vision.text;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.text.Text;
import defpackage.byn;
import defpackage.kxn;
import defpackage.nvn;
import defpackage.rxn;
import defpackage.sxn;
import defpackage.vxn;
import defpackage.xdn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public class Text {
    private final List zza;
    private final String zzb;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Symbol extends TextBase {
        private final float zza;
        private final float zzb;

        public Symbol(byn bynVar, Matrix matrix) {
            super(bynVar.a, bynVar.b, bynVar.c, "", matrix);
            this.zza = bynVar.d;
            this.zzb = bynVar.e;
        }

        public float getAngle() {
            return this.zzb;
        }

        public float getConfidence() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class TextBase {
        private final String zza;
        private final Rect zzb;
        private final Point[] zzc;
        private final String zzd;

        public TextBase(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.zza = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                CommonConvertUtils.transformRect(rect2, matrix);
            }
            this.zzb = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i = 0; i < list.size(); i++) {
                pointArr[i] = new Point((Point) list.get(i));
            }
            if (matrix != null) {
                CommonConvertUtils.transformPointArray(pointArr, matrix);
            }
            this.zzc = pointArr;
            this.zzd = str2;
        }

        public Rect getBoundingBox() {
            return this.zzb;
        }

        public Point[] getCornerPoints() {
            return this.zzc;
        }

        public String getRecognizedLanguage() {
            return this.zzd;
        }

        public final String zza() {
            String str = this.zza;
            if (str == null) {
                return "";
            }
            return str;
        }
    }

    public Text(vxn vxnVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        this.zzb = vxnVar.a;
        arrayList.addAll(xdn.d(vxnVar.b, new nvn() { // from class: com.google.mlkit.vision.text.zza
            @Override // defpackage.nvn
            public final Object zza(Object obj) {
                return new Text.TextBlock((kxn) obj, matrix);
            }
        }));
    }

    public String getText() {
        return this.zzb;
    }

    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.zza);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class TextBlock extends TextBase {
        private final List zza;

        public TextBlock(kxn kxnVar, final Matrix matrix) {
            super(kxnVar.a, kxnVar.b, kxnVar.c, kxnVar.d, matrix);
            this.zza = xdn.d(kxnVar.e, new nvn() { // from class: com.google.mlkit.vision.text.zzd
                @Override // defpackage.nvn
                public final Object zza(Object obj) {
                    sxn sxnVar = (sxn) obj;
                    return new Text.Line(sxnVar, matrix, sxnVar.f, sxnVar.g);
                }
            });
        }

        public synchronized List<Line> getLines() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }

        public TextBlock(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.zza = list2;
        }
    }

    public Text(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(list);
        this.zzb = str;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Line extends TextBase {
        private final List zza;
        private final float zzb;
        private final float zzc;

        public Line(sxn sxnVar, final Matrix matrix, float f, float f2) {
            super(sxnVar.a, sxnVar.b, sxnVar.c, sxnVar.d, matrix);
            this.zza = xdn.d(sxnVar.e, new nvn() { // from class: com.google.mlkit.vision.text.zzc
                @Override // defpackage.nvn
                public final Object zza(Object obj) {
                    return new Text.Element((rxn) obj, matrix);
                }
            });
            this.zzb = f;
            this.zzc = f2;
        }

        public float getAngle() {
            return this.zzc;
        }

        public float getConfidence() {
            return this.zzb;
        }

        public synchronized List<Element> getElements() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }

        public Line(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f, float f2) {
            super(str, rect, list, str2, matrix);
            this.zza = list2;
            this.zzb = f;
            this.zzc = f2;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static class Element extends TextBase {
        private final List zza;
        private final float zzb;
        private final float zzc;

        public Element(rxn rxnVar, final Matrix matrix) {
            super(rxnVar.a, rxnVar.b, rxnVar.c, rxnVar.d, matrix);
            this.zzb = rxnVar.e;
            this.zzc = rxnVar.f;
            List list = rxnVar.g;
            this.zza = xdn.d(list == null ? new ArrayList() : list, new nvn() { // from class: com.google.mlkit.vision.text.zzb
                @Override // defpackage.nvn
                public final Object zza(Object obj) {
                    return new Text.Symbol((byn) obj, matrix);
                }
            });
        }

        public float getAngle() {
            return this.zzc;
        }

        public float getConfidence() {
            return this.zzb;
        }

        public synchronized List<Symbol> getSymbols() {
            return this.zza;
        }

        public String getText() {
            return zza();
        }

        public Element(String str, Rect rect, List list, String str2, Matrix matrix, float f, float f2, List list2) {
            super(str, rect, list, str2, matrix);
            this.zzb = f;
            this.zzc = f2;
            this.zza = list2;
        }
    }
}
