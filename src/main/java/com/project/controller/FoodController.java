package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.food.model.BucketVO;
import com.project.food.model.FoodVO;
import com.project.food.serivce.FoodService;
import com.project.food.serivce.FoodServiceImpl;

@WebServlet("*.food")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FoodController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAction(request, response);
	}

	protected void doAction(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		String uri = request.getRequestURI();
		String path = (String) uri.substring(request.getContextPath().length());

		System.out.println("이동 경로 : " + path);

		FoodService service = new FoodServiceImpl();

		// 메인화면에서 장바구니 버튼 클릭
		if (path.equals("/order/basket.food")) {
			ArrayList<BucketVO> list = service.foodList(request, response);
			request.setAttribute("list", list);
			request.getRequestDispatcher("foodlist.jsp").forward(request, response);
		// mainfood.jsp 화면 표출 ( DB 데이터 출력 )
		}else if (path.equals("/order/order1.food")) {

			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/mainfood.jsp").forward(request, response);
			
		// stick.jsp 화면 표출 ( DB 데이터 출력 )
		} else if (path.equals("/order/order2.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/stick.jsp").forward(request, response);

		// fried.jsp 화면 표출 ( DB 데이터 출력 )
		}else if (path.equals("/order/order3.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/fried.jsp").forward(request, response);

		// pancake.jsp 화면 표출 ( DB 데이터 출력 )
		} else if (path.equals("/order/order4.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/pancake.jsp").forward(request, response);

		// rice.jsp 화면 표출 ( DB 데이터 출력 )
		} else if (path.equals("/order/order5.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/rice.jsp").forward(request, response);

		// desert.jsp 화면 표출 ( DB 데이터 출력 )
		} else if (path.equals("/order/order6.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/desert.jsp").forward(request, response);

		// beverage.jsp 화면 표출 ( DB 데이터 출력 )
		} else if (path.equals("/order/order7.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/beverage.jsp").forward(request, response);

		// drink.jsp 화면 표출 ( DB 데이터 출력 )
		} else if (path.equals("/order/order8.food")) {
			ArrayList<FoodVO> list = service.getList(request, response);
			request.setAttribute("list", list);
			System.out.println("수신 : " + list);
			request.getRequestDispatcher("../food/drink.jsp").forward(request, response);
		
		// mainfood.jsp 음식선택 및 order_list table insert
		}else if(path.equals("/order/insertForm1.food")) {
			service.inSert(request, response);
			response.sendRedirect("order1.food?type=" + request.getParameter("type"));
		
		// stick.jsp 음식 선택 및 order_list table insert	
		}else if(path.equals("/order/insertForm2.food")) {
			service.inSert(request, response);
			response.sendRedirect("order2.food?type=" + request.getParameter("type"));
			
		// fried.jsp 음식 선택 및 order_list table insert
		}else if(path.equals("/order/insertForm3.food")) {
			service.inSert(request, response);
			response.sendRedirect("order3.food?type=" + request.getParameter("type"));
		
		// pancake.jsp 음식 선택 및 order_list table insert
		}else if(path.equals("/order/insertForm4.food")) {
			service.inSert(request, response);
			response.sendRedirect("order4.food?type=" + request.getParameter("type"));
			
		// rice.jsp 음식 선택 및 order_list table insert	
		}else if(path.equals("/order/insertForm5.food")) {
			service.inSert(request, response);
			response.sendRedirect("order5.food?type=" + request.getParameter("type"));
			
		// desert.jsp 음식 선택 및 order_list table insert
		}else if(path.equals("/order/insertForm6.food")) {
			service.inSert(request, response);
			response.sendRedirect("order6.food?type=" + request.getParameter("type"));
			
		// beverage.jsp 음식 선택 및 order_list table insert	
		}else if(path.equals("/order/insertForm7.food")) {
			service.inSert(request, response);
			response.sendRedirect("order7.food?type=" + request.getParameter("type"));
			
		// drink.jsp 음식 선택 및 order_list table insert	
		}else if(path.equals("/order/insertForm8.food")) {
			service.inSert(request, response);
			response.sendRedirect("order8.food?type=" + request.getParameter("type"));
			
			
		}else if(path.equals("/order/deleteForm.food")) {
			service.order(request, response);
			response.setContentType("text/html; charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('주문이 성공적으로 접수되었습니다.');");
			out.println("location.href='../order/main.jsp';");
			out.println("</script>");
			System.out.println("delete controller 동작");
			/* response.sendRedirect("../order/main.jsp"); */
		}

	}
}
