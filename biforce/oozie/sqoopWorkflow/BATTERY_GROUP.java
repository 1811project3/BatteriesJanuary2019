// ORM class for table 'BATTERY_GROUP'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu Feb 07 16:42:51 PST 2019
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class BATTERY_GROUP extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("BATCH_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BATCH_ID = (Integer)value;
      }
    });
    setters.put("SKILL_TYPE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        SKILL_TYPE = (String)value;
      }
    });
    setters.put("TRAINER_ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        TRAINER_ID = (Integer)value;
      }
    });
  }
  public BATTERY_GROUP() {
    init0();
  }
  private Integer BATCH_ID;
  public Integer get_BATCH_ID() {
    return BATCH_ID;
  }
  public void set_BATCH_ID(Integer BATCH_ID) {
    this.BATCH_ID = BATCH_ID;
  }
  public BATTERY_GROUP with_BATCH_ID(Integer BATCH_ID) {
    this.BATCH_ID = BATCH_ID;
    return this;
  }
  private String SKILL_TYPE;
  public String get_SKILL_TYPE() {
    return SKILL_TYPE;
  }
  public void set_SKILL_TYPE(String SKILL_TYPE) {
    this.SKILL_TYPE = SKILL_TYPE;
  }
  public BATTERY_GROUP with_SKILL_TYPE(String SKILL_TYPE) {
    this.SKILL_TYPE = SKILL_TYPE;
    return this;
  }
  private Integer TRAINER_ID;
  public Integer get_TRAINER_ID() {
    return TRAINER_ID;
  }
  public void set_TRAINER_ID(Integer TRAINER_ID) {
    this.TRAINER_ID = TRAINER_ID;
  }
  public BATTERY_GROUP with_TRAINER_ID(Integer TRAINER_ID) {
    this.TRAINER_ID = TRAINER_ID;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BATTERY_GROUP)) {
      return false;
    }
    BATTERY_GROUP that = (BATTERY_GROUP) o;
    boolean equal = true;
    equal = equal && (this.BATCH_ID == null ? that.BATCH_ID == null : this.BATCH_ID.equals(that.BATCH_ID));
    equal = equal && (this.SKILL_TYPE == null ? that.SKILL_TYPE == null : this.SKILL_TYPE.equals(that.SKILL_TYPE));
    equal = equal && (this.TRAINER_ID == null ? that.TRAINER_ID == null : this.TRAINER_ID.equals(that.TRAINER_ID));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BATTERY_GROUP)) {
      return false;
    }
    BATTERY_GROUP that = (BATTERY_GROUP) o;
    boolean equal = true;
    equal = equal && (this.BATCH_ID == null ? that.BATCH_ID == null : this.BATCH_ID.equals(that.BATCH_ID));
    equal = equal && (this.SKILL_TYPE == null ? that.SKILL_TYPE == null : this.SKILL_TYPE.equals(that.SKILL_TYPE));
    equal = equal && (this.TRAINER_ID == null ? that.TRAINER_ID == null : this.TRAINER_ID.equals(that.TRAINER_ID));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.BATCH_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SKILL_TYPE = JdbcWritableBridge.readString(2, __dbResults);
    this.TRAINER_ID = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.BATCH_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.SKILL_TYPE = JdbcWritableBridge.readString(2, __dbResults);
    this.TRAINER_ID = JdbcWritableBridge.readInteger(3, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(BATCH_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SKILL_TYPE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(TRAINER_ID, 3 + __off, 4, __dbStmt);
    return 3;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(BATCH_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(SKILL_TYPE, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(TRAINER_ID, 3 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.BATCH_ID = null;
    } else {
    this.BATCH_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SKILL_TYPE = null;
    } else {
    this.SKILL_TYPE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.TRAINER_ID = null;
    } else {
    this.TRAINER_ID = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.BATCH_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.BATCH_ID);
    }
    if (null == this.SKILL_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SKILL_TYPE);
    }
    if (null == this.TRAINER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TRAINER_ID);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.BATCH_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.BATCH_ID);
    }
    if (null == this.SKILL_TYPE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, SKILL_TYPE);
    }
    if (null == this.TRAINER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.TRAINER_ID);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(BATCH_ID==null?"null":"" + BATCH_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKILL_TYPE==null?"null":SKILL_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRAINER_ID==null?"null":"" + TRAINER_ID, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(BATCH_ID==null?"null":"" + BATCH_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SKILL_TYPE==null?"null":SKILL_TYPE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(TRAINER_ID==null?"null":"" + TRAINER_ID, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BATCH_ID = null; } else {
      this.BATCH_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SKILL_TYPE = null; } else {
      this.SKILL_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TRAINER_ID = null; } else {
      this.TRAINER_ID = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BATCH_ID = null; } else {
      this.BATCH_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.SKILL_TYPE = null; } else {
      this.SKILL_TYPE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.TRAINER_ID = null; } else {
      this.TRAINER_ID = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    BATTERY_GROUP o = (BATTERY_GROUP) super.clone();
    return o;
  }

  public void clone0(BATTERY_GROUP o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("BATCH_ID", this.BATCH_ID);
    __sqoop$field_map.put("SKILL_TYPE", this.SKILL_TYPE);
    __sqoop$field_map.put("TRAINER_ID", this.TRAINER_ID);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("BATCH_ID", this.BATCH_ID);
    __sqoop$field_map.put("SKILL_TYPE", this.SKILL_TYPE);
    __sqoop$field_map.put("TRAINER_ID", this.TRAINER_ID);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
