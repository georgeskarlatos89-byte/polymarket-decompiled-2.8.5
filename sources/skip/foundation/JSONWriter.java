package skip.foundation;

import com.socure.docv.capturesdk.common.utils.ApiConstant;
import defpackage.hkj;
import defpackage.r2i;
import defpackage.vsj;
import io.ably.lib.util.AgentHeaderCreator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import skip.foundation.JSONSerialization;
import skip.lib.Array;
import skip.lib.CustomStringConvertibleKt;
import skip.lib.Dictionary;
import skip.lib.DictionaryKt;
import skip.lib.MutableStruct;
import skip.lib.NumbersKt;
import skip.lib.StructKt;
import skip.lib.Tuple2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u0001B'\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0012\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0002\b#J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&H\u0002J\u001d\u0010'\u001a\u00020\u00072\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0)H\u0000¢\u0006\u0002\b*J'\u0010+\u001a\u00020\u00072\u0018\u0010,\u001a\u0014\u0012\b\u0012\u00060\u001fj\u0002`.\u0012\u0006\u0012\u0004\u0018\u00010\u001f0-H\u0000¢\u0006\u0002\b/J\r\u00100\u001a\u00020\u0007H\u0000¢\u0006\u0002\b1J\r\u00104\u001a\u00020\u0007H\u0000¢\u0006\u0002\b5J\r\u00106\u001a\u00020\u0007H\u0000¢\u0006\u0002\b7J\r\u00108\u001a\u00020\u0007H\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0002\b;J\b\u0010C\u001a\u00020\u0001H\u0016R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\"\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u00102\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0010R(\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\rX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012¨\u0006D"}, d2 = {"Lskip/foundation/JSONWriter;", "Lskip/lib/MutableStruct;", "options", "Lskip/foundation/JSONSerialization$WritingOptions;", "writer", "Lkotlin/Function1;", "", "", "<init>", "(Lskip/foundation/JSONSerialization$WritingOptions;Lkotlin/jvm/functions/Function1;)V", "copy", "(Lskip/lib/MutableStruct;)V", "newValue", "", "indent", "getIndent$SkipFoundation", "()I", "setIndent$SkipFoundation", "(I)V", "pretty", "", "getPretty$SkipFoundation", "()Z", "sortedKeys", "getSortedKeys$SkipFoundation", "withoutEscapingSlashes", "getWithoutEscapingSlashes$SkipFoundation", "getWriter$SkipFoundation", "()Lkotlin/jvm/functions/Function1;", "serializeJSON", "object_", "", "serializeJSON$SkipFoundation", "serializeString", "str", "serializeString$SkipFoundation", "serializeFloat", "num", "", "serializeArray", "array", "Lskip/lib/Array;", "serializeArray$SkipFoundation", "serializeDictionary", "dict", "Lskip/lib/Dictionary;", "Lskip/lib/AnyHashable;", "serializeDictionary$SkipFoundation", "serializeNull", "serializeNull$SkipFoundation", "indentAmount", "getIndentAmount$SkipFoundation", "incIndent", "incIndent$SkipFoundation", "incAndWriteIndent", "incAndWriteIndent$SkipFoundation", "decAndWriteIndent", "decAndWriteIndent$SkipFoundation", "writeIndent", "writeIndent$SkipFoundation", "supdate", "getSupdate", "setSupdate", "(Lkotlin/jvm/functions/Function1;)V", "smutatingcount", "getSmutatingcount", "setSmutatingcount", "scopy", "SkipFoundation"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
final class JSONWriter implements MutableStruct {
    private int indent;
    private final int indentAmount;
    private final boolean pretty;
    private int smutatingcount;
    private final boolean sortedKeys;
    private Function1<Object, Unit> supdate;
    private final boolean withoutEscapingSlashes;
    private final Function1<String, Unit> writer;

    /* JADX WARN: Multi-variable type inference failed */
    public JSONWriter(JSONSerialization.WritingOptions writingOptions, Function1<? super String, Unit> function1) {
        writingOptions.getClass();
        function1.getClass();
        this.indentAmount = 2;
        JSONSerialization.WritingOptions.Companion companion = JSONSerialization.WritingOptions.INSTANCE;
        this.pretty = writingOptions.contains(companion.getPrettyPrinted());
        this.sortedKeys = writingOptions.contains(companion.getSortedKeys());
        this.withoutEscapingSlashes = writingOptions.contains(companion.getWithoutEscapingSlashes());
        this.writer = function1;
    }

    public static /* synthetic */ boolean a(Tuple2 tuple2, Tuple2 tuple22) {
        return serializeDictionary$lambda$0(tuple2, tuple22);
    }

    private static final boolean serializeDictionary$lambda$0(Tuple2 tuple2, Tuple2 tuple22) {
        String str;
        tuple2.getClass();
        tuple22.getClass();
        Object key = PackageSupportKt.getKey(tuple2);
        String str2 = null;
        if (key instanceof String) {
            str = (String) key;
        } else {
            str = null;
        }
        if (str != null) {
            Object key2 = PackageSupportKt.getKey(tuple22);
            if (key2 instanceof String) {
                str2 = (String) key2;
            }
            if (str2 != null) {
                if (str.compareTo(str2) < 0) {
                    return true;
                }
                return false;
            }
            throw new NSError(NSErrorKt.getNSCocoaErrorDomain(), CocoaError.INSTANCE.getPropertyListReadCorrupt().getRawValue().intValue(), DictionaryKt.dictionaryOf(new Tuple2(NSErrorKt.getNSDebugDescriptionErrorKey(), "NSDictionary key must be NSString")));
        }
        throw new NSError(NSErrorKt.getNSCocoaErrorDomain(), CocoaError.INSTANCE.getPropertyListReadCorrupt().getRawValue().intValue(), DictionaryKt.dictionaryOf(new Tuple2(NSErrorKt.getNSDebugDescriptionErrorKey(), "NSDictionary key must be NSString")));
    }

    private static final void serializeDictionary$serializeDictionaryElement(Ref.a aVar, JSONWriter jSONWriter, Object obj, Object obj2) {
        String str;
        String str2;
        if (aVar.a) {
            aVar.a = false;
        } else {
            boolean z = jSONWriter.pretty;
            Function1<String, Unit> function1 = jSONWriter.writer;
            if (z) {
                function1.invoke(",\n");
                jSONWriter.writeIndent$SkipFoundation();
            } else {
                function1.invoke(",");
            }
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str != null) {
            jSONWriter.serializeString$SkipFoundation(str);
            boolean z2 = jSONWriter.pretty;
            Function1<String, Unit> function12 = jSONWriter.writer;
            if (z2) {
                str2 = " : ";
            } else {
                str2 = ":";
            }
            function12.invoke(str2);
            jSONWriter.serializeJSON$SkipFoundation(obj2);
            return;
        }
        throw new NSError(NSErrorKt.getNSCocoaErrorDomain(), CocoaError.INSTANCE.getPropertyListReadCorrupt().getRawValue().intValue(), DictionaryKt.dictionaryOf(new Tuple2(NSErrorKt.getNSDebugDescriptionErrorKey(), "NSDictionary key must be NSString")));
    }

    private final void serializeFloat(double num) {
        if (NumbersKt.isFinite(num)) {
            String description = CustomStringConvertibleKt.getDescription(Double.valueOf(num));
            if (skip.lib.StringKt.hasSuffix(description, ".0")) {
                description = StringKt.String$default(r2i.D(2, description), null, null, null, null, null, 62, null);
            }
            this.writer.invoke(description);
            return;
        }
        throw new NSError(NSErrorKt.getNSCocoaErrorDomain(), CocoaError.INSTANCE.getPropertyListReadCorrupt().getRawValue().intValue(), DictionaryKt.dictionaryOf(new Tuple2(NSErrorKt.getNSDebugDescriptionErrorKey(), "Invalid number value (" + num + ") in JSON write")));
    }

    public final void decAndWriteIndent$SkipFoundation() {
        willmutate();
        try {
            setIndent$SkipFoundation(this.indent - this.indentAmount);
            writeIndent$SkipFoundation();
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public void didmutate() {
        super.didmutate();
    }

    /* renamed from: getIndent$SkipFoundation, reason: from getter */
    public final int getIndent() {
        return this.indent;
    }

    /* renamed from: getIndentAmount$SkipFoundation, reason: from getter */
    public final int getIndentAmount() {
        return this.indentAmount;
    }

    /* renamed from: getPretty$SkipFoundation, reason: from getter */
    public final boolean getPretty() {
        return this.pretty;
    }

    @Override // skip.lib.MutableStruct
    public int getSmutatingcount() {
        return this.smutatingcount;
    }

    /* renamed from: getSortedKeys$SkipFoundation, reason: from getter */
    public final boolean getSortedKeys() {
        return this.sortedKeys;
    }

    @Override // skip.lib.MutableStruct
    public Function1<Object, Unit> getSupdate() {
        return this.supdate;
    }

    /* renamed from: getWithoutEscapingSlashes$SkipFoundation, reason: from getter */
    public final boolean getWithoutEscapingSlashes() {
        return this.withoutEscapingSlashes;
    }

    public final Function1<String, Unit> getWriter$SkipFoundation() {
        return this.writer;
    }

    public final void incAndWriteIndent$SkipFoundation() {
        willmutate();
        try {
            setIndent$SkipFoundation(this.indent + this.indentAmount);
            writeIndent$SkipFoundation();
        } finally {
            didmutate();
        }
    }

    public final void incIndent$SkipFoundation() {
        willmutate();
        try {
            setIndent$SkipFoundation(this.indent + this.indentAmount);
        } finally {
            didmutate();
        }
    }

    @Override // skip.lib.MutableStruct
    public MutableStruct scopy() {
        return new JSONWriter(this);
    }

    public final void serializeArray$SkipFoundation(Array<Object> array) {
        array.getClass();
        willmutate();
        try {
            this.writer.invoke("[");
            if (this.pretty) {
                this.writer.invoke("\n");
                incIndent$SkipFoundation();
            }
            boolean z = true;
            Iterator it = ((Array) StructKt.sref$default(array, null, 1, null)).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (z) {
                    z = false;
                } else {
                    boolean z2 = this.pretty;
                    Function1<String, Unit> function1 = this.writer;
                    if (z2) {
                        function1.invoke(",\n");
                    } else {
                        function1.invoke(",");
                    }
                }
                if (this.pretty) {
                    writeIndent$SkipFoundation();
                }
                serializeJSON$SkipFoundation(next);
            }
            if (this.pretty) {
                this.writer.invoke("\n");
                decAndWriteIndent$SkipFoundation();
            }
            this.writer.invoke("]");
            didmutate();
        } catch (Throwable th) {
            didmutate();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.Ref$a, java.lang.Object] */
    public final void serializeDictionary$SkipFoundation(Dictionary<Object, Object> dict) {
        dict.getClass();
        willmutate();
        try {
            this.writer.invoke("{");
            if (this.pretty) {
                this.writer.invoke("\n");
                incIndent$SkipFoundation();
                if (dict.getCount() > 0) {
                    writeIndent$SkipFoundation();
                }
            }
            ?? obj = new Object();
            obj.a = true;
            if (this.sortedKeys) {
                Iterator it = ((Array) StructKt.sref$default(dict.sorted(new Object()), null, 1, null)).iterator();
                while (it.hasNext()) {
                    Tuple2 tuple2 = (Tuple2) it.next();
                    serializeDictionary$serializeDictionaryElement(obj, this, PackageSupportKt.getKey(tuple2), PackageSupportKt.getValue(tuple2));
                }
            } else {
                Iterator it2 = ((Dictionary) StructKt.sref$default(dict, null, 1, null)).iterator();
                while (it2.hasNext()) {
                    Tuple2 tuple22 = (Tuple2) it2.next();
                    serializeDictionary$serializeDictionaryElement(obj, this, tuple22.component1(), tuple22.component2());
                }
            }
            if (this.pretty) {
                this.writer.invoke("\n");
                decAndWriteIndent$SkipFoundation();
            }
            this.writer.invoke("}");
            didmutate();
        } catch (Throwable th) {
            didmutate();
            throw th;
        }
    }

    public final void serializeJSON$SkipFoundation(Object object_) {
        willmutate();
        try {
            Object sref$default = StructKt.sref$default(StructKt.sref$default(object_, null, 1, null), null, 1, null);
            if (sref$default == null) {
                serializeNull$SkipFoundation();
                return;
            }
            if (sref$default instanceof String) {
                serializeString$SkipFoundation((String) sref$default);
            } else if (sref$default instanceof Boolean) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof Integer) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof Byte) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof Short) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof Integer) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof Long) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof UInt) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof UByte) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof vsj) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof UInt) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof hkj) {
                this.writer.invoke(CustomStringConvertibleKt.getDescription(sref$default));
            } else if (sref$default instanceof Array) {
                serializeArray$SkipFoundation((Array) sref$default);
            } else if (sref$default instanceof Dictionary) {
                serializeDictionary$SkipFoundation((Dictionary) sref$default);
            } else if (sref$default instanceof Float) {
                serializeFloat(NumbersKt.Double((Number) sref$default));
            } else if (sref$default instanceof Double) {
                serializeFloat(((Number) sref$default).doubleValue());
            } else if (sref$default instanceof NSNull) {
                serializeNull$SkipFoundation();
            } else {
                throw new NSError(NSErrorKt.getNSCocoaErrorDomain(), CocoaError.INSTANCE.getPropertyListReadCorrupt().getRawValue().intValue(), DictionaryKt.dictionaryOf(new Tuple2(NSErrorKt.getNSDebugDescriptionErrorKey(), "Invalid object cannot be serialized")));
            }
        } finally {
            didmutate();
        }
    }

    public final void serializeNull$SkipFoundation() {
        this.writer.invoke("null");
    }

    public final void serializeString$SkipFoundation(String str) {
        str.getClass();
        this.writer.invoke("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t') {
                if (charAt != '\n') {
                    if (charAt != '\r') {
                        if (charAt != '\"') {
                            if (charAt != '/') {
                                Function1<String, Unit> function1 = this.writer;
                                if (charAt != '\\') {
                                    function1.invoke(skip.lib.StringKt.String(charAt));
                                } else {
                                    function1.invoke("\\\\");
                                }
                            } else {
                                if (!this.withoutEscapingSlashes) {
                                    this.writer.invoke("\\");
                                }
                                this.writer.invoke(AgentHeaderCreator.AGENT_DIVIDER);
                            }
                        } else {
                            this.writer.invoke("\\\"");
                        }
                    } else {
                        this.writer.invoke("\\r");
                    }
                } else {
                    this.writer.invoke("\\n");
                }
            } else {
                this.writer.invoke("\\t");
            }
        }
        this.writer.invoke("\"");
    }

    public final void setIndent$SkipFoundation(int i) {
        willmutate();
        this.indent = i;
        didmutate();
    }

    @Override // skip.lib.MutableStruct
    public void setSmutatingcount(int i) {
        this.smutatingcount = i;
    }

    @Override // skip.lib.MutableStruct
    public void setSupdate(Function1<Object, Unit> function1) {
        this.supdate = function1;
    }

    @Override // skip.lib.MutableStruct
    public void willmutate() {
        super.willmutate();
    }

    public final void writeIndent$SkipFoundation() {
        int i = this.indent;
        for (int i2 = 0; i2 < i; i2++) {
            this.writer.invoke(ApiConstant.SPACE);
        }
    }

    private JSONWriter(MutableStruct mutableStruct) {
        mutableStruct.getClass();
        JSONWriter jSONWriter = (JSONWriter) mutableStruct;
        setIndent$SkipFoundation(jSONWriter.indent);
        this.pretty = jSONWriter.pretty;
        this.sortedKeys = jSONWriter.sortedKeys;
        this.withoutEscapingSlashes = jSONWriter.withoutEscapingSlashes;
        this.writer = jSONWriter.writer;
        this.indentAmount = jSONWriter.indentAmount;
    }
}
