import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haowang
 * @date 2020-06-10 12:03 下午
 */
public class UserUtil {
  private static String sep = "\\001";
  public static ObjectMapper objectMapper = new ObjectMapper();


  public static String formattedItem(String item) throws Exception {
//    objectMapper.writeValueAsString(new User(item, sep));
    Map<String, Object> values = new HashMap();
    String[] col_names = {"id", "tid", "emobile", "status", "type", "pub", "wbname", "username", "realname", "py", "gender", "ccode", "mobile", "email", "qq", "weixin", "phone", "province", "city", "address", "ht_province", "ht_city", "birthday", "purpose", "profession", "major", "skills", "stags", "level", "work_time", "degree", "salary", "custom_text", "rank0", "rank1", "rank2", "rank3", "rank", "new_qp", "maxrp", "judge", "company", "position", "qp", "figure", "avatar", "headline", "verified", "weibo_tags", "tag_weights", "circles", "info_ratio", "resume_ratio", "rights", "job_count", "tf_count", "dist1_maimai", "dist1_count", "dist2_count", "contact_ok", "views", "favs", "name_seed", "next_name_time", "crtime", "uptime"};
    String[] col = item.split(sep);

    for (int i = 0; i < col_names.length; i++) {
      values.put(col_names[i], col[i]);
    }
//    System.out.println(objectMapper.writeValueAsString(values));
//    return objectMapper.writeValueAsString(objectMapper.convertValue(values, User.class));
    return objectMapper.writeValueAsString(values);

  }

  public static void main(String[] args) throws Exception {
    UserUtil.formattedItem("");
  }

  public static class User {
    private int id;
    private String tid;
    private String emobile;
    private int status;
    private int type;
    private int pub;
    private String wbname;
    private String username;
    private String realname;
    private String py;
    private int gender;
    private String ccode;
    private String mobile;
    private String email;
    private String qq;
    private String weixin;
    private String phone;
    private String province;
    private String city;
    private String address;
    private String ht_province;
    private String ht_city;
    private String birthday;
    private int purpose;
    private int profession;
    private int major;
    private int skills;
    private String stags;
    private int level;
    private int work_time;
    private int degree;
    private int salary;
    private String custom_text;
    private float rank0;
    private float rank1;
    private float rank2;
    private float rank3;
    private float rank;
    private int new_qp;
    private int maxrp;
    private int judge;
    private String company;
    private String position;
    private float qp;
    private String figure;
    private String avatar;
    private String headline;
    private String verified;
    private String weibo_tags;
    private String tag_weights;
    private String circles;
    private int info_ratio;
    private int resume_ratio;
    private int rights;
    private int job_count;
    private int tf_count;
    private String dist1_maimai;
    private String dist1_count;
    private String dist2_count;
    private int contact_ok;
    private int views;
    private int favs;
    private String name_seed;
    private String next_name_time;
    private String crtime;
    private String uptime;

    public User() {
    }

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getTid() {
      return tid;
    }

    public void setTid(String tid) {
      this.tid = tid;
    }

    public String getEmobile() {
      return emobile;
    }

    public void setEmobile(String emobile) {
      this.emobile = emobile;
    }

    public int getStatus() {
      return status;
    }

    public void setStatus(int status) {
      this.status = status;
    }

    public int getType() {
      return type;
    }

    public void setType(int type) {
      this.type = type;
    }

    public int getPub() {
      return pub;
    }

    public void setPub(int pub) {
      this.pub = pub;
    }

    public String getWbname() {
      return wbname;
    }

    public void setWbname(String wbname) {
      this.wbname = wbname;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getRealname() {
      return realname;
    }

    public void setRealname(String realname) {
      this.realname = realname;
    }

    public String getPy() {
      return py;
    }

    public void setPy(String py) {
      this.py = py;
    }

    public int getGender() {
      return gender;
    }

    public void setGender(int gender) {
      this.gender = gender;
    }

    public String getCcode() {
      return ccode;
    }

    public void setCcode(String ccode) {
      this.ccode = ccode;
    }

    public String getMobile() {
      return mobile;
    }

    public void setMobile(String mobile) {
      this.mobile = mobile;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public String getQq() {
      return qq;
    }

    public void setQq(String qq) {
      this.qq = qq;
    }

    public String getWeixin() {
      return weixin;
    }

    public void setWeixin(String weixin) {
      this.weixin = weixin;
    }

    public String getPhone() {
      return phone;
    }

    public void setPhone(String phone) {
      this.phone = phone;
    }

    public String getProvince() {
      return province;
    }

    public void setProvince(String province) {
      this.province = province;
    }

    public String getCity() {
      return city;
    }

    public void setCity(String city) {
      this.city = city;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public String getHt_province() {
      return ht_province;
    }

    public void setHt_province(String ht_province) {
      this.ht_province = ht_province;
    }

    public String getHt_city() {
      return ht_city;
    }

    public void setHt_city(String ht_city) {
      this.ht_city = ht_city;
    }

    public String getBirthday() {
      return birthday;
    }

    public void setBirthday(String birthday) {
      this.birthday = birthday;
    }

    public int getPurpose() {
      return purpose;
    }

    public void setPurpose(int purpose) {
      this.purpose = purpose;
    }

    public int getProfession() {
      return profession;
    }

    public void setProfession(int profession) {
      this.profession = profession;
    }

    public int getMajor() {
      return major;
    }

    public void setMajor(int major) {
      this.major = major;
    }

    public int getSkills() {
      return skills;
    }

    public void setSkills(int skills) {
      this.skills = skills;
    }

    public String getStags() {
      return stags;
    }

    public void setStags(String stags) {
      this.stags = stags;
    }

    public int getLevel() {
      return level;
    }

    public void setLevel(int level) {
      this.level = level;
    }

    public int getWork_time() {
      return work_time;
    }

    public void setWork_time(int work_time) {
      this.work_time = work_time;
    }

    public int getDegree() {
      return degree;
    }

    public void setDegree(int degree) {
      this.degree = degree;
    }

    public int getSalary() {
      return salary;
    }

    public void setSalary(int salary) {
      this.salary = salary;
    }

    public String getCustom_text() {
      return custom_text;
    }

    public void setCustom_text(String custom_text) {
      this.custom_text = custom_text;
    }

    public float getRank0() {
      return rank0;
    }

    public void setRank0(float rank0) {
      this.rank0 = rank0;
    }

    public float getRank1() {
      return rank1;
    }

    public void setRank1(float rank1) {
      this.rank1 = rank1;
    }

    public float getRank2() {
      return rank2;
    }

    public void setRank2(float rank2) {
      this.rank2 = rank2;
    }

    public float getRank3() {
      return rank3;
    }

    public void setRank3(float rank3) {
      this.rank3 = rank3;
    }

    public float getRank() {
      return rank;
    }

    public void setRank(float rank) {
      this.rank = rank;
    }

    public int getNew_qp() {
      return new_qp;
    }

    public void setNew_qp(int new_qp) {
      this.new_qp = new_qp;
    }

    public int getMaxrp() {
      return maxrp;
    }

    public void setMaxrp(int maxrp) {
      this.maxrp = maxrp;
    }

    public int getJudge() {
      return judge;
    }

    public void setJudge(int judge) {
      this.judge = judge;
    }

    public String getCompany() {
      return company;
    }

    public void setCompany(String company) {
      this.company = company;
    }

    public String getPosition() {
      return position;
    }

    public void setPosition(String position) {
      this.position = position;
    }

    public float getQp() {
      return qp;
    }

    public void setQp(float qp) {
      this.qp = qp;
    }

    public String getFigure() {
      return figure;
    }

    public void setFigure(String figure) {
      this.figure = figure;
    }

    public String getAvatar() {
      return avatar;
    }

    public void setAvatar(String avatar) {
      this.avatar = avatar;
    }

    public String getHeadline() {
      return headline;
    }

    public void setHeadline(String headline) {
      this.headline = headline;
    }

    public String getVerified() {
      return verified;
    }

    public void setVerified(String verified) {
      this.verified = verified;
    }

    public String getWeibo_tags() {
      return weibo_tags;
    }

    public void setWeibo_tags(String weibo_tags) {
      this.weibo_tags = weibo_tags;
    }

    public String getTag_weights() {
      return tag_weights;
    }

    public void setTag_weights(String tag_weights) {
      this.tag_weights = tag_weights;
    }

    public String getCircles() {
      return circles;
    }

    public void setCircles(String circles) {
      this.circles = circles;
    }

    public int getInfo_ratio() {
      return info_ratio;
    }

    public void setInfo_ratio(int info_ratio) {
      this.info_ratio = info_ratio;
    }

    public int getResume_ratio() {
      return resume_ratio;
    }

    public void setResume_ratio(int resume_ratio) {
      this.resume_ratio = resume_ratio;
    }

    public int getRights() {
      return rights;
    }

    public void setRights(int rights) {
      this.rights = rights;
    }

    public int getJob_count() {
      return job_count;
    }

    public void setJob_count(int job_count) {
      this.job_count = job_count;
    }

    public int getTf_count() {
      return tf_count;
    }

    public void setTf_count(int tf_count) {
      this.tf_count = tf_count;
    }

    public String getDist1_maimai() {
      return dist1_maimai;
    }

    public void setDist1_maimai(String dist1_maimai) {
      this.dist1_maimai = dist1_maimai;
    }

    public String getDist1_count() {
      return dist1_count;
    }

    public void setDist1_count(String dist1_count) {
      this.dist1_count = dist1_count;
    }

    public String getDist2_count() {
      return dist2_count;
    }

    public void setDist2_count(String dist2_count) {
      this.dist2_count = dist2_count;
    }

    public int getContact_ok() {
      return contact_ok;
    }

    public void setContact_ok(int contact_ok) {
      this.contact_ok = contact_ok;
    }

    public int getViews() {
      return views;
    }

    public void setViews(int views) {
      this.views = views;
    }

    public int getFavs() {
      return favs;
    }

    public void setFavs(int favs) {
      this.favs = favs;
    }

    public String getName_seed() {
      return name_seed;
    }

    public void setName_seed(String name_seed) {
      this.name_seed = name_seed;
    }

    public String getNext_name_time() {
      return next_name_time;
    }

    public void setNext_name_time(String next_name_time) {
      this.next_name_time = next_name_time;
    }

    public String getCrtime() {
      return crtime;
    }

    public void setCrtime(String crtime) {
      this.crtime = crtime;
    }

    public String getUptime() {
      return uptime;
    }

    public void setUptime(String uptime) {
      this.uptime = uptime;
    }
  }


}
