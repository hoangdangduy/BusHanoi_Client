package controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.BusActionStub;
import ws.BusActionStub.BusSchedule;
import ws.BusActionStub.GetListBusBy2Position;

/**
 * Servlet implementation class BusAction
 */
public class BusAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**	
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html; charset=UTF-8");
		out.println("nguyễn văn a");
		
		
		
		String startLoc = request.getParameter("startLoc");
//		String endLoc = request.getParameter("endLoc");
		
		out.println(startLoc);
//		
//		BusActionStub stub = new BusActionStub();
//		GetListBusBy2Position busBy2Position = new GetListBusBy2Position();
//		busBy2Position.setName1(startLoc);
//		busBy2Position.setName2(endLoc);
//		
//		BusSchedule[] listBus = stub.getListBusBy2Position(busBy2Position).get_return();
//		
//		for (BusSchedule bus : listBus){
//			out.println(bus.getName());
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
