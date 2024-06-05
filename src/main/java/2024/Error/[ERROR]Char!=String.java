import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import energy.mdul.base.CBase;
import energy.mdul.helper.CDao;
import energy.mdul.helper.IDao;

@Controller
public class login {

	@RequestMapping(value = "/CST/loginProc.do", method = RequestMethod.POST, produces = "application/text; charset=utf8")
	public String loginProc(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap)
			throws ClassCastException, IOException, ServletException, SQLException, NoSuchAlgorithmException,Exception {
		
		CDao dao = null;
		CBase cbase = new CBase(request, response);
		String userId = cb.Get("id");	// 화면에서 받아온 ID
		String userPw = cb.Get("pw");	// 화면에서 받아온 PW	
		String P_SELECT = cbase.Get("P_SELECT");	// 화면에서 받아온 구분자
		
		Map<String, Object> result = new HashMap<String, Object>();	// DB 결과를 담음
		
		Map<String, Object> Param = new HashMap<String, Object>();
		Param.put("P_USERID", userId); 		//db에 가져갈 값
		Param.put("P_APP_SCT", P_SELECT);	//db에 가져갈 값
		Param.put("P_PKG_NM", "Login_Do"); //db 패키지에서 조회
		dao = new CDao("PKG_00.ps_01", IDao.Select);
		dao.SetRequestParameter(request, Param);
		result = dao.ExecuteMap();		
		
		Map<String,Object> map = dao.ExecuteMap();
		
		String id	   	   = cbase.String(map.get("ID")); //db에서 가져온 값 저장
		String pwd 		   = cbase.String(map.get("PW"));
		String user_select = cbase.String(map.get("SCT"));
		
		//Unlikely argument type for equals(): char seems to be unrelated to String
		// '' => char
		// "" => String
		// user_select는 String 인데 equals에서 ''로 문자를 비교해 오류가 남(문자와 문자열 형이 달라 인식을 못함)
				if(user_select.equals("A")) {
					return cbase.RedirectPost(request.getContextPath() + "/CST/RF_01/RF_01_01_010.do");
				}
				
				if(user_select.equals("B")){
					return cbase.RedirectPost(request.getContextPath() + "/CST/RF_01/RF_01_02_010.do");
				}
				

	}

}
